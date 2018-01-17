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
			System.out.println("서버가 시작되었습니다");
			
			while (true) {
				System.out.println("연결 대기중");
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
				System.out.println("스트림 초기화 오류");
				e.printStackTrace();
			}
		}
		//서버에 참여중인 사람들에게 메세지 전달 
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
			sendToAll("#"+name+"["+socket.getInetAddress()+":"+socket.getPort()+"]"+"님이 대화방에 접속하였습니다");
			clients.put(name, output);
			System.out.println(name+"["+socket.getInetAddress()+":"+socket.getPort()+"]"+"님이 대화방에 접속하였습니다");
			System.out.println("현재"+clients.size()+"명이 대화방에 접속중입니다");
			
			while(input!=null) {
				sendToAll(input.readUTF());//대기
			}
			
		} catch (Exception e) {
		}finally {
			clients.remove(name);
			sendToAll("#"+name+"["+socket.getInetAddress()+":"+socket.getPort()+"]"+"님이 대화방에서 나갔습니다");
			System.out.println(name+"["+socket.getInetAddress()+":"+socket.getPort()+"]"+"님이 대화방에서 나갔습니다");
			System.out.println("현재"+clients.size()+"명이 대화방에 접속중입니다");
			
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
