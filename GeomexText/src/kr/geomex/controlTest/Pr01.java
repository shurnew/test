package kr.geomex.controlTest;
import java.lang.Object;
import java.util.Scanner;
public class Pr01 {

	
		Scanner input=new Scanner(System.in);
		//wrapper 클래스를 사용하여 기본 자료형 int를 객체로 포장해  변수 int1 생성함 질문:객체에 대하여 변수와 객체의차이점?
		Integer int1= new Integer(0);
		
	
		public void print() {
			
			int x= 0;
			int y=0;
			
			//Object클래스의 equals메소드로 변수int1의 값과 x 비교해서 int1의값과 x의 값이 같을다면 true다르면 false값을 반환함
			System.out.println(int1.equals(x));
			
			System.out.println("2차원공간안에 좌표값을 입력하세요");
			
			
			System.out.println("x값을 입력하세요");
			
			x = input.nextInt();
			
			System.out.println("y값을 입력하세요");
			
			y = input.nextInt();
			
			if( x>0&&y>0) {
				System.out.println("1사분면");
			} 
			
			else if( x<0&&y>0) {
				System.out.println("2사분면");
			}
			else if( x<0&&y<0) {
				System.out.println("3사분면");
			}
			else if( x>0&&y<0) {
				System.out.println("4사분면");
			}
			else {
				System.out.println("사분면의중심");
			}
		}
		
	}
