package kr.geomex.sorket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Jv_11_3UDPServer {

	public static void main(String[] args) {
		try {
			DatagramSocket ds = new DatagramSocket(9999);
			byte[] bf =new byte[30];
			DatagramPacket dp= new DatagramPacket(bf, bf.length);
			while (true) {
				try {
					ds.receive(dp);
					String rs1= new String(dp.getData());
					String rs2= new String(rs1.trim());
					System.out.println("�ּ� :"+dp.getAddress()+"��Ʈ :"+dp.getPort());
					System.out.println("���ŵ� �޼���:"+rs2);
					
				} catch (IOException e) {
					
				}
			}
		}catch (IOException e) {

		}

	}

}
