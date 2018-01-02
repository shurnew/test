package kr.geomex.controlTest;

import java.util.Scanner;

/**
 * 세개의 정수중 가장 작은값을 구해보는  프로그램
 * 
 * @version 2017-12-28
 * @author 신선호
 *
 */
public class Pr02 {
		
		int a,b,c;		
		
		public Pr02(int a, int b, int c) {
			
			this.a = a;
			this.b = b;
			this.c = c;
		 
			System.out.println("객체생성됨");
		}
		
		//1. 반환 이해
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
			
			
			System.out.println("수"+a+" "+b+" "+c);
			
			System.out.println("가장작은값은"+minReturn());
			
		
		
			
			
			

			
			
		}		
	}