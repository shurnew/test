package kr.geomex.controlTest;

import java.io.IOException;
public class Pr03 {
	
	public  void run() throws IOException {
		
		int ch= 0;
	
		System.out.println("�����Ѱ��� �Է��ϼ���");
		
		ch= System.in.read();
		System.out.println(ch);
		switch(ch) 
		{
		case '\t':
			System.out.println("���̴�");
			break;
		case '\n':
			System.out.println("�����̴�");
			break;
		case '\b':
			System.out.println("�齺���̽��̴�");
			break;
		
		default: System.out.println("��Ÿ����");
		
		
		}
	}
	
}
