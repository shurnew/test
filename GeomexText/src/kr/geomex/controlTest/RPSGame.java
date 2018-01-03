package kr.geomex.controlTest;

import java.util.Scanner;
import java.util.*;
public class RPSGame {
	
	Random random=new Random();
	Scanner input =new Scanner(System.in);
	int count=0;
	
		public boolean check(int i) {
			
			count=random.nextInt(3)+1;
			
		//	System.out.println(count);
			

			switch(count)
			{
				case 1 : System.out.println("비겼다");
						
					break;
				case 2:System.out.println("졌다");
					
					break;
				case 3 :System.out.println("이겼다");
					
					break;
				
			}
			
			return true;
		}
	
		public boolean run (int i) {
		
			System.out.println("1~3과 중에 입력하세요");
			
			System.out.println("1(가위) 2(바위) 3(보)");
			i= input.nextInt();
			
			
			switch(i)
			{
				case 1 : System.out.println("가위");
					
				check(i);
					break;
				case 2 :System.out.println("바위");
				check(i);
					break;
					
				case 3 :System.out.println("보");
				check(i);
					break;
			
				default:System.out.println("값을다시입력해주세요");
				
		
				
			}
			return true;
			
		}	

	}

