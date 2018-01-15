package kr.geomex.sorket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {

		Socket socket = new Socket();
		DataOutputStream dos = null;
		DataInputStream dis = null;

		try {
			socket.connect(new InetSocketAddress("127.0.0.1", 4001));
			dis = new DataInputStream(socket.getInputStream());
			dos = new DataOutputStream(socket.getOutputStream());
			System.out.println("연결성공");
			String str = "안녕하세요";
			dos.writeUTF(str);
			System.out.println(dis.readUTF());

		} catch (IOException e) {

			System.out.println("서버를 찾을 수없습니다");
		} finally {

			try {

				dos.close();
			} catch (IOException e) {

				System.out.println("오류발생");
			}
			try {

				dis.close();
			} catch (IOException e) {

				System.out.println("오류발생");
			}
		}

	}
}
