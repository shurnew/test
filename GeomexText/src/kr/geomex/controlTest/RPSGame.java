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
				case 1 : System.out.println("����");
						
					break;
				case 2:System.out.println("����");
					
					break;
				case 3 :System.out.println("�̰��");
					
					break;
				
			}
			
			return true;
		}
	
		public boolean run (int i) {
		
			System.out.println("1~3�� �߿� �Է��ϼ���");
			
			System.out.println("1(����) 2(����) 3(��)");
			i= input.nextInt();
			
			
			switch(i)
			{
				case 1 : System.out.println("����");
					
				check(i);
					break;
				case 2 :System.out.println("����");
				check(i);
					break;
					
				case 3 :System.out.println("��");
				check(i);
					break;
			
				default:System.out.println("�����ٽ��Է����ּ���");
				
		
				
			}
			return true;
			
		}	

	}

