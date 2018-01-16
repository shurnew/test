package kr.geomex.sorket;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ClientSender extends Thread {
	Socket socket;
	DataOutputStream output;
	String name;
	public ClientSender(Socket socket,String name) {
			this.name= name;
		try {
			output=  new DataOutputStream(socket.getOutputStream());
			System.out.println(name);
			output.writeUTF(name);
			System.out.println("대화방에입장하였습니다");
			
		} catch (IOException e) {
			
			e.printStackTrace();
		} 
		
	}
	
	
	@Override
	public void run() {
		Scanner sc =new Scanner(System.in);
		String msg = "";
		
		try {
			msg=sc.nextLine();
			if (msg.equals("exit")) {
				System.exit(0);
			}
			
			output.writeUTF("["+name+"]:"+msg);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
