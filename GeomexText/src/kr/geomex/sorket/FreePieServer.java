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

		Collections.synchronizedList(customers);// ������ü����
	}

	public void start() {
		Socket socket;
		try {

			serverSocket = new ServerSocket(00010);
			while (true) {

				System.out.println("���� �����:" + pie + "���� ���̰� ���ҽ��ϴ�");
				socket = serverSocket.accept();

				PieReceiver receiver = new PieReceiver(socket);
				receiver.start();// ���������
			}
		} catch (IOException e) {
			System.out.println("���ε�����");
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
				System.out.println("����,��Ʈ���ʱ�ȭ����");

			}
		}

		public void sendToAll() throws Exception {
			for (int i = 0; i < customers.size(); i++) {

				DataOutputStream dos = customers.get(i);

				dos.writeUTF("���� ���� ������ ����  " + pie + "�� �Դϴ�");

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
					output.writeUTF("���̰� �� ���������ϴ�");
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
