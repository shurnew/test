package kr.geomex.a.main;

import kr.geomex.b.arrayTest.InsertArray;
import kr.geomex.b.controlTest.Pr01;
import kr.geomex.b.controlTest.Pr02;
import kr.geomex.b.controlTest.RPSGame;
import kr.geomex.b.controlTest.TestMethod;

public class ControlMain {

	public static void main(String[] args) {
		
		/**
		 * scener�� ���� x��ǥ�� y��ǥ�� �Է¹޾� ��и��� ��ġ�� ǥ���ϴ� ���α׷�
		 */
		
		/*
		Pr01 pr01 = new Pr01();
		pr01.print();
		*/
		
		/**
		 * �����������߿��� ���� ���� ���� ���ϴ�  ���α׷�
		 */
		
		/*
		Pr02 obj = new Pr02(6,3,9);
		obj.print();
		*/
		
		
		/** ��ȯ��  �޼ҵ�� �Ϲݸ޼ҵ忡 ���� �ڵ� 
		����: �Լ��� �޼ҵ��� �������� ���Ͽ� �����ϱ�  ��°�� ���� �̸����� ������ ��������*/ 
		 
		  TestMethod f1 =new TestMethod();
		  
		  TestMethod f2 =new TestMethod("123");
		  
		  TestMethod f3 =new TestMethod(4);
		 
		  System.out.println("---------------------------");
 		
		  f1. print();
 		
		  System.out.println("---------------------------");
		
		  f1. print(50);
		 
		  System.out.println("2���޼ҵ��� ��ȯ��"+f1.print(50));
		 
		
		/**
		 * switch ���� �̿��� ���������� ���α׷�
		 */
		
		/*
		RPSGame game= new RPSGame();
		game.run(1);
		*/
		
	}

}
