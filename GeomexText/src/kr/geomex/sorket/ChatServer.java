package kr.geomex.sorket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class ChatServer {
	HashMap<String, DataOutputStream> clients;
	ServerSocket serverSocket;
	
	
	public ChatServer() {
		
		clients= new HashMap<String,DataOutputStream>();
		
		Collections.synchronizedMap(clients);
	}
	
	public static void main(String[] args) {
		new ChatServer().start();

	}
	
	public void start() {
		
		try {
			Socket socket;
			serverSocket =new ServerSocket(9999);
			System.out.println("������ ���۵Ǿ����ϴ�");
			
			while (true) {
				System.out.println("���� �����");
				socket=serverSocket.accept();
				SeverReceiver receiver =new SeverReceiver(socket);
				receiver.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	class SeverReceiver extends Thread{
		Socket socket;
		DataInputStream input;
		DataOutputStream output;
		
		public SeverReceiver(Socket socket) {
			this.socket= socket;
			
			try {
				input= new DataInputStream(socket.getInputStream());
				output = new DataOutputStream(socket.getOutputStream());
			} catch (IOException e) {
				System.out.println("��Ʈ�� �ʱ�ȭ ����");
				e.printStackTrace();
			}
		}
		//������ �������� ����鿡�� �޼��� ���� 
		public void sendToAll(String message) {
			
			Iterator<String> it = clients.keySet().iterator(); 
			
			while (it.hasNext()) {
				try {
					DataOutputStream dos =clients.get(it.next());
						
						dos.writeUTF(message);

				} catch (Exception e) {
					
				}
				
			}
		}
		@Override
		public void run() {
		String name ="";
		try {
			name=input.readUTF();
			sendToAll("#"+name+"["+socket.getInetAddress()+":"+socket.getPort()+"]"+"���� ��ȭ�濡 �����Ͽ����ϴ�");
			clients.put(name, output);
			System.out.println(name+"["+socket.getInetAddress()+":"+socket.getPort()+"]"+"���� ��ȭ�濡 �����Ͽ����ϴ�");
			System.out.println("����"+clients.size()+"���� ��ȭ�濡 �������Դϴ�");
			
			while(input!=null) {
				sendToAll(input.readUTF());//���
			}
			
		} catch (Exception e) {
		}finally {
			clients.remove(name);
			sendToAll("#"+name+"["+socket.getInetAddress()+":"+socket.getPort()+"]"+"���� ��ȭ�濡�� �������ϴ�");
			System.out.println(name+"["+socket.getInetAddress()+":"+socket.getPort()+"]"+"���� ��ȭ�濡�� �������ϴ�");
			System.out.println("����"+clients.size()+"���� ��ȭ�濡 �������Դϴ�");
			
			try {
				input.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			try {
				output.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		}
	}
}
