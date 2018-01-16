package kr.geomex.sorket;

import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.MalformedInputException;

public class JV_11_5 {

	public static void main(String[] args) throws Exception, MalformedInputException {

		URL u = new URL("http://www.naver.com/");
		System.out.println("==========URLŬ������ �޼ҵ�============");
		System.out.println("��������:" + u.getProtocol());
		System.out.println("��Ʈ:" + u.getPort());
		System.out.println("ȣ��Ʈ:" + u.getHost());
		System.out.println("����(�������):" + u.getFile());
		System.out.println("��ü URL:" + u.toExternalForm());

		System.out.println("===URLConnectionŬ������ �޼ҵ�======");
		URLConnection uc = u.openConnection();
		int len = uc.getContentLength();
		System.out.println("������ ���� :" + len + "����Ʈ");
		URL uu = uc.getURL();
		System.out.println("URL :" + uu);

		System.out.println("===InetAddress Ŭ���� �޼ҵ�===");
		InetAddress addr = null;
		addr = InetAddress.getByName("www.bu.ac.kr");
		System.out.println("��ǻ���̸��� IP�ּ�");
		System.out.println(addr);
		InetAddress Na[] = InetAddress.getAllByName("www.yonsei.ac.kr");
		System.out.println("www.yonsei.ac.kr�� ���� ����");
		for (int i = 0; i < Na.length; i++) {
			System.out.println(Na[i]);
		}
		
		addr =InetAddress.getLocalHost();
		System.out.println("�� �� ��ǻ���� �̸�:"+addr.getHostName());
		byte ip[] = addr.getAddress();
		System.out.println("���� ��ǻ���� IP�ּ� :");
		for (int i = 0; i < ip.length; i++) {
			if(i>0) {
				System.out.print(".");
			}
			System.out.print(ip[i]&0xff);
		}
		System.out.println("\n���� ��ǻ���� IP �ּ�:"+addr.getHostAddress());
	}

}
