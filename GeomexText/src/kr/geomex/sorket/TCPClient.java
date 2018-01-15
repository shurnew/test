package kr.geomex.sorket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {

	public static void main(String[] args) {
		
		Socket socket = null; 
		InputStream is = null;
		DataInputStream dis = null;
		OutputStream os = null;
		DataOutputStream dos = null;
	try {
		
		String str = "제가왔습니다";
		socket= new Socket("127.0.0.1",1234);
		is= socket.getInputStream();
		dis=new DataInputStream(is);
		String st = new String(dis.readUTF());
		System.out.println(st);
		os= socket.getOutputStream();
		dos=new DataOutputStream(os);
		dos.writeUTF(str);
	}catch (Exception e) {
	
	}finally {
		try {
			dos.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		try {
			os.close();
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
		try {
			dis.close();
		} catch (IOException e) {
						e.printStackTrace();
		}
		try {
			is.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		try {
			socket.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
		
	}
}
