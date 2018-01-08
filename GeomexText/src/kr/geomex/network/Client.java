package kr.geomex.network;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {
	
	public static void main(String[] args) throws IOException {
	
		Socket socket = null;
		
		try {
			
			socket = new Socket();
			
			socket.connect(new InetSocketAddress("127.0.0.1",5001));
			
			System.out.println("client connect");
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			socket.close();
		}
	}
}
