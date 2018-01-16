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
			name =input.readUTF();//�̸�
			sendToALL("#"+name+"["+socket.getInetAddress()+":"+socket.getPort()+"] ���� ��ȭ �濡 ���� �Ͽ����ϴ�");
			clients.put(name, output);
			System.out.println(name+"["+socket.getInetAddress()+":"+socket.getPort()+"] ���� ��ȭ �濡 ���� �Ͽ����ϴ�");
			System.out.println("����"+clients.size()+"���� ��ȭ�濡 �������Դϴ�");
			
			while (input!=null) {
				System.out.println("�Է´����");
				sendToALL(input.readUTF());
			}
		} catch (IOException e) {
		}finally {
			clients.remove(name);
			sendToALL("#"+name+"["+socket.getInetAddress()+":"+socket.getPort()+"] ���� ��ȭ �濡�� �������ϴ�");
			clients.put(name, output);
			System.out.println(name+"["+socket.getInetAddress()+":"+socket.getPort()+"] ���� ��ȭ �濡�� �������ϴ�");
			System.out.println("����"+clients.size()+"���� ��ȭ�濡 �������Դϴ�");
		}
		
	}
}
