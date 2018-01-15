package kr.geomex.sorket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) {
	
		ServerSocket serverSocket = null;
		Socket socket=null;
		OutputStream os = null;
		InputStream is=null;
		DataOutputStream dos=null;
		DataInputStream dis=null;
		
		
		try {
			serverSocket= new ServerSocket(1234);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		while (true) {
			
			try {
				System.out.println("�����غ�Ϸ�");
				socket=serverSocket.accept();
				System.out.println("Ŭ���̾�Ʈ ����");
				
				os= socket.getOutputStream();
				dos= new DataOutputStream(os);
				dos.writeUTF("�ȳ��ϼ��� ȯ���մϴ� ����");
				
				is= socket.getInputStream();
				dis= new DataInputStream(is);
				String st=new String(dis.readUTF());
				System.out.println(st);
				
			} catch (IOException e) {
				
				e.printStackTrace();
				
			}finally {
				try {
					os.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
				try {
					is.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
				try {
					dos.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
				try {
					dis.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}

		}
	}
}
