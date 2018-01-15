package kr.geomex.sorket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {

		ServerSocket serverSocket = null;
		Socket socket = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;

		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("127.0.0.1", 4001));
			socket = serverSocket.accept();
			System.out.println("클라이언트들어옴");
			dis = new DataInputStream(socket.getInputStream());
			dos = new DataOutputStream(socket.getOutputStream());
			String str = dis.readUTF();
			System.out.println("클라이언트 : " + str);
			dos.writeUTF("서버 : " + str);

		} catch (IOException e) {

		} finally {
			try {
				socket.close();
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
