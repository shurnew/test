package kr.geomex.sorket;

import java.net.Socket;
import java.util.Scanner;

public class MultiChatClient {
	
	public String name;
	private Socket socket;
	private String serverIp = "127.0.0.1";
	
	public static void main(String[] args) {
		new MultiChatClient().start();
	}
	public void start() {
		try {
			socket= new Socket(serverIp, 7777);
			System.out.println("������ ����Ǿ����ϴ� ��ȭ���� �Է����ּ���");
			name=new Scanner(System.in).nextLine();
			
			ClientReceiver clientReceiver= new ClientReceiver(socket);
			ClientSender clientSender = new ClientSender(socket,name); 
			
			
			clientReceiver.start();
			clientSender.start();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	

}
