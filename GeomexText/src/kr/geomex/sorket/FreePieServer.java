package kr.geomex.sorket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import javax.sound.midi.Synthesizer;

public class FreePieServer {

	ServerSocket serverSocket;
	ArrayList<DataOutputStream> customers;
	int pie = 10;

	public FreePieServer() {
		customers = new ArrayList<DataOutputStream>();

		Collections.synchronizedList(customers);// 공유객체설정
	}

	public void start() {
		Socket socket;
		try {

			serverSocket = new ServerSocket(00010);
			while (true) {

				System.out.println("서버 대기중:" + pie + "개의 파이가 남았습니다");
				socket = serverSocket.accept();

				PieReceiver receiver = new PieReceiver(socket);
				receiver.start();// 스레드시작
			}
		} catch (IOException e) {
			System.out.println("바인딩에러");
		}
	}

	public static void main(String[] args) {
		new FreePieServer().start();

	}

	class PieReceiver extends Thread {
		Socket socket;
		// DataInputStream input;
		DataOutputStream output;

		public PieReceiver(Socket socket) {
			this.socket = socket;

			try {
				// input = new DataInputStream(socket.getInputStream());
				output = new DataOutputStream(socket.getOutputStream());
			} catch (IOException e) {
				System.out.println("소켓,스트림초기화오류");

			}
		}

		public void sendToAll() throws Exception {
			for (int i = 0; i < customers.size(); i++) {

				DataOutputStream dos = customers.get(i);

				dos.writeUTF("현재 남은 파이의 수는  " + pie + "개 입니다");

			}
		}

		@Override
		public void run() {

			customers.add(output);
			
			

			try {
				if (pie != 0) {
					pie -= 1;
					sendToAll();
				} else {
					output.writeUTF("파이가 다 떨어졌습니다");
				}	
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				customers.remove(0);
				try {
					output.close();
				} catch (IOException e) {

					e.printStackTrace();
				}
			}

		}
	}
}
