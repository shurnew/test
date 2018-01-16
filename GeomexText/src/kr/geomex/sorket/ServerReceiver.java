package kr.geomex.sorket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;

public class ServerReceiver extends Thread {
	Socket socket;
	DataInputStream input;
	DataOutputStream output;
	HashMap<String, DataOutputStream> clients;
	
	public ServerReceiver(Socket socket,HashMap<String,DataOutputStream>clients) {
	 this.socket =socket;
	 this.clients=clients;
	 try {
		input= new DataInputStream(socket.getInputStream());
		output= new DataOutputStream(socket.getOutputStream());
	} catch (IOException e) {
		//e.printStackTrace();
	}
	}
	
	public void sendToALL(String message) {
		
		Iterator<String> it = clients.keySet().iterator();
		while (it.hasNext()) {
			try {
				
				DataOutputStream dos= clients.get(it.next());
				dos.writeUTF(message);
			} catch (Exception e) {

			}
			
		}
	}
	@Override
	public void run() {
		String name="";
		try {
			name =input.readUTF();//이름
			sendToALL("#"+name+"["+socket.getInetAddress()+":"+socket.getPort()+"] 님이 대화 방에 접속 하였습니다");
			clients.put(name, output);
			System.out.println(name+"["+socket.getInetAddress()+":"+socket.getPort()+"] 님이 대화 방에 접속 하였습니다");
			System.out.println("현재"+clients.size()+"명이 대화방에 접속중입니다");
			
			while (input!=null) {
				System.out.println("입력대기중");
				sendToALL(input.readUTF());
			}
		} catch (IOException e) {
		}finally {
			clients.remove(name);
			sendToALL("#"+name+"["+socket.getInetAddress()+":"+socket.getPort()+"] 님이 대화 방에서 나갔습니다");
			clients.put(name, output);
			System.out.println(name+"["+socket.getInetAddress()+":"+socket.getPort()+"] 님이 대화 방에서 나갔습니다");
			System.out.println("현재"+clients.size()+"명이 대화방에 접속중입니다");
		}
		
	}
}
