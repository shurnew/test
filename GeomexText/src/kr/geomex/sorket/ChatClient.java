package kr.geomex.sorket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {

	String name;
	Socket socket;
	String serverIp = "127.0.0.1";

	public static void main(String[] args) {
		new ChatClient().start();
		
	}

	public void start() {
		try {
			socket = new Socket(serverIp, 9999);
			System.out.println("������ ����Ǿ����ϴ� .��ȭ���� �Է��ϼ��� :");
			name = new Scanner(System.in).nextLine();

			ClientReceiver clientReceiver = new ClientReceiver(socket);
			ClientSender clientSender = new ClientSender(socket);
			
			clientReceiver.start();
			clientSender.start();
		} catch (Exception e) {
		}
	}

	class ClientReceiver extends Thread {
		Socket socket;
		DataInputStream input;

		public ClientReceiver(Socket socket) {
			this.socket = socket;
			try {
				input = new DataInputStream(socket.getInputStream());
			} catch (IOException e) {

			}
		}

		@Override
		public void run() {
			while (input != null) {
				try {
					System.out.println(input.readUTF());
				} catch (IOException e) {
				}
			}

		}
	}

	class ClientSender extends Thread {

		Socket socket;
		DataOutputStream output;

		public ClientSender(Socket socket) {
			this.socket = socket;
			try {
				output = new DataOutputStream(socket.getOutputStream());
				output.writeUTF(name);
				System.out.println("��ȭ�濡 ���� �Ͽ����ϴ�");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		@Override
		public void run() {
			Scanner sc =new Scanner(System.in);
			String msg = "";
			
			while (output!= null) {
				
				try {
					
				msg= sc.nextLine();
				
				if(msg.equals("exit")) {
					System.exit(0);
				}
					output.writeUTF("["+name+"]"+msg );
					
				} catch (IOException e) {
					
					e.printStackTrace();
				}
				
			}
		}
	}
}
