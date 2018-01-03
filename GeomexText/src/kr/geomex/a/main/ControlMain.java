package kr.geomex.a.main;

import kr.geomex.b.arrayTest.InsertArray;
import kr.geomex.b.controlTest.Pr01;
import kr.geomex.b.controlTest.Pr02;
import kr.geomex.b.controlTest.RPSGame;
import kr.geomex.b.controlTest.TestMethod;

public class ControlMain {

	public static void main(String[] args) {
		
		/**
		 * scener를 통해 x좌표와 y좌표를 입력받아 사분면의 위치를 표시하는 프로그램
		 */
		
		/*
		Pr01 pr01 = new Pr01();
		pr01.print();
		*/
		
		/**
		 * 세가지정수중에서 가장 작은 값을 구하는  프로그램
		 */
		
		/*
		Pr02 obj = new Pr02(6,3,9);
		obj.print();
		*/
		
		
		/** 반환형  메소드와 일반메소드에 관한 코드 
		질문: 함수와 메소드의 차이점에 관하여 질문하기  어째서 같은 이름으로 적용이 가능한지*/ 
		 
		  TestMethod f1 =new TestMethod();
		  
		  TestMethod f2 =new TestMethod("123");
		  
		  TestMethod f3 =new TestMethod(4);
		 
		  System.out.println("---------------------------");
 		
		  f1. print();
 		
		  System.out.println("---------------------------");
		
		  f1. print(50);
		 
		  System.out.println("2번메소드의 반환값"+f1.print(50));
		 
		
		/**
		 * switch 문을 이용한 가위바위보 프로그램
		 */
		
		/*
		RPSGame game= new RPSGame();
		game.run(1);
		*/
		
	}

}
