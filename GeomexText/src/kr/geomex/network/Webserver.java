package kr.geomex.network;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Webserver {

	public static void main(String[] args) throws IOException {
		
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("127.0.0.1",5001));
			System.out.println("server connected");
			
			while (true) {
				
				socket = serverSocket.accept();
				System.out.println("accept success");
			}
			
			
		} catch (Exception e) {
			
		} finally {
			
			serverSocket.close();
		}

	}

}
