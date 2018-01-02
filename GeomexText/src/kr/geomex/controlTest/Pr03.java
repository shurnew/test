package kr.geomex.controlTest;

import java.io.IOException;
public class Pr03 {
	
	public  void run() throws IOException {
		
		int ch= 0;
	
		System.out.println("문자한개를 입력하세요");
		
		ch= System.in.read();
		System.out.println(ch);
		switch(ch) 
		{
		case '\t':
			System.out.println("탭이다");
			break;
		case '\n':
			System.out.println("엔터이다");
			break;
		case '\b':
			System.out.println("백스페이스이다");
			break;
		
		default: System.out.println("기타문자");
		
		
		}
	}
	
}
