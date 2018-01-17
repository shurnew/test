package kr.geomex.sorket;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;

public class MultChatServer {
	public HashMap<String, DataOutputStream> clients;
	private ServerSocket serverSocket;

	public static void main(String[] args) {
		new MultChatServer().start();
	}
	
	
	public MultChatServer() {
		clients = new HashMap<String, DataOutputStream>();
		Collections.synchronizedMap(clients);
	}

	public void start() {
		try {
			Socket socket;
			serverSocket= new ServerSocket(7777);
			System.out.println("서버가 시작되었습니다");
			
			while (true) {
				socket =serverSocket.accept();
			
				ServerReceiver receiver =new ServerReceiver(socket,clients);
				receiver.start();
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
