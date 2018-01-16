package kr.geomex.sorket;

import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.MalformedInputException;

public class JV_11_5 {

	public static void main(String[] args) throws Exception, MalformedInputException {

		URL u = new URL("http://www.naver.com/");
		System.out.println("==========URL클래스의 메소드============");
		System.out.println("프로토콜:" + u.getProtocol());
		System.out.println("포트:" + u.getPort());
		System.out.println("호스트:" + u.getHost());
		System.out.println("파일(경로포함):" + u.getFile());
		System.out.println("전체 URL:" + u.toExternalForm());

		System.out.println("===URLConnection클래스의 메소드======");
		URLConnection uc = u.openConnection();
		int len = uc.getContentLength();
		System.out.println("문서의 길이 :" + len + "바이트");
		URL uu = uc.getURL();
		System.out.println("URL :" + uu);

		System.out.println("===InetAddress 클래스 메소드===");
		InetAddress addr = null;
		addr = InetAddress.getByName("www.bu.ac.kr");
		System.out.println("컴퓨터이름과 IP주소");
		System.out.println(addr);
		InetAddress Na[] = InetAddress.getAllByName("www.yonsei.ac.kr");
		System.out.println("www.yonsei.ac.kr에 대한 정보");
		for (int i = 0; i < Na.length; i++) {
			System.out.println(Na[i]);
		}
		
		addr =InetAddress.getLocalHost();
		System.out.println("로 컬 컴퓨터의 이름:"+addr.getHostName());
		byte ip[] = addr.getAddress();
		System.out.println("로컬 컴퓨터의 IP주소 :");
		for (int i = 0; i < ip.length; i++) {
			if(i>0) {
				System.out.print(".");
			}
			System.out.print(ip[i]&0xff);
		}
		System.out.println("\n로컬 컴퓨터의 IP 주소:"+addr.getHostAddress());
	}

}
