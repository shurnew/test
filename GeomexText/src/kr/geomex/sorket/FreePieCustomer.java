package kr.geomex.sorket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class FreePieCustomer {
	Socket socket;
	
	
	String ip = "127.0.0.1";

	public FreePieCustomer() {

	}

	public static void main(String[] args) {
		new FreePieCustomer().start();
	}

	public void start() {
		try {
			socket=new Socket(ip, 00010);
			System.out.println("접속성공");
			CustomerReceiver receiver = new CustomerReceiver(socket);
			receiver.start();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	class CustomerReceiver extends Thread{
		Socket socket;
		DataInputStream input;
		
		public CustomerReceiver(Socket socket) {
			this.socket= socket;
			
			try {
				input= new DataInputStream(socket.getInputStream());
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
		@Override
		public void run() {
		
			try {
				
				System.out.println(input.readUTF());
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}finally {
				try {
					input.close();
				} catch (IOException e) {
				
					e.printStackTrace();
				}
			}
		}
	}
}
