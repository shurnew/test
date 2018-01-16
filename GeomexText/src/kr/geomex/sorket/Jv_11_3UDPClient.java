package kr.geomex.sorket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Jv_11_3UDPClient {

	public static void main(String[] args) {
		try {
			DatagramSocket ds = new DatagramSocket();
			InetAddress ia = InetAddress.getByName("localhost");
			String s= "클라이언트메세지";
			byte[] bf = s.getBytes();
			DatagramPacket dp = new DatagramPacket(bf, bf.length, ia, 9999);
			ds.send(dp);
		} catch (Exception e) {

		}
	}
}
