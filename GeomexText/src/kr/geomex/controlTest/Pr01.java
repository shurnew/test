package kr.geomex.controlTest;
import java.lang.Object;
import java.util.Scanner;
public class Pr01 {

	
		Scanner input=new Scanner(System.in);
		//wrapper Ŭ������ ����Ͽ� �⺻ �ڷ��� int�� ��ü�� ������  ���� int1 ������ ����:��ü�� ���Ͽ� ������ ��ü��������?
		Integer int1= new Integer(0);
		
	
		public void print() {
			
			int x= 0;
			int y=0;
			
			//ObjectŬ������ equals�޼ҵ�� ����int1�� ���� x ���ؼ� int1�ǰ��� x�� ���� �����ٸ� true�ٸ��� false���� ��ȯ��
			System.out.println(int1.equals(x));
			
			System.out.println("2���������ȿ� ��ǥ���� �Է��ϼ���");
			
			
			System.out.println("x���� �Է��ϼ���");
			
			x = input.nextInt();
			
			System.out.println("y���� �Է��ϼ���");
			
			y = input.nextInt();
			
			if( x>0&&y>0) {
				System.out.println("1��и�");
			} 
			
			else if( x<0&&y>0) {
				System.out.println("2��и�");
			}
			else if( x<0&&y<0) {
				System.out.println("3��и�");
			}
			else if( x>0&&y<0) {
				System.out.println("4��и�");
			}
			else {
				System.out.println("��и����߽�");
			}
		}
		
	}
