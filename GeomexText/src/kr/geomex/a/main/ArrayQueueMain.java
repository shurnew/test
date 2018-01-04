package kr.geomex.a.main;

import java.io.IOException;
import java.util.ArrayList;

import kr.geomex.collecttionTest.ArrayQueue;

public class ArrayQueueMain {

	public static void main(String[] args) {

		ArrayQueue aq = new ArrayQueue(); 

		try {
			aq.add(1);
			aq.add(2);
			
		} catch (IOException e1) {
			
			System.out.println("���ܹ߻�!!!111111111111");
		} catch (Exception e) {
			
			System.out.println("���ܹ߻�!!!");
		}
		
		/*aq.add(3);
		aq.add(4);
		aq.add(5);*/
 
		try {
			System.out.println(aq.delete());
			System.out.println(aq.delete());

			System.out.println("----------------------------------------------------");

			aq.print();
			System.out.println("----------------------------------------------------");
			System.out.println(aq.delete());
			
		} catch (Exception e) {
			
			System.out.println("���ܹ߻�");
			
		}

		

		System.out.println("----------------------------------------------------");

		aq.print();
		
	}

}
