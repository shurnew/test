package kr.geomex.controlTest;

import java.util.Scanner;

/**
 * ������ ������ ���� �������� ���غ���  ���α׷�
 * 
 * @version 2017-12-28
 * @author �ż�ȣ
 *
 */
public class Pr02 {
		
		int a,b,c;		
		
		public Pr02(int a, int b, int c) {
			
			this.a = a;
			this.b = b;
			this.c = c;
		 
			System.out.println("��ü������");
		}
		
		//1. ��ȯ ����
		public int minReturn() {
			
			int min;
			
			if(a<b) {
				
				min=a;
			} else {
				
				min=b;
			}
			
			if(c<min) {
				
				min=c;
			}
			
			
			return min;
		}
		
		//2.
		
		public void print() {
			
			
			System.out.println("��"+a+" "+b+" "+c);
			
			System.out.println("������������"+minReturn());
			
		
		
			
			
			

			
			
		}		
	}