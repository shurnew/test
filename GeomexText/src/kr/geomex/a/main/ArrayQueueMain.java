package kr.geomex.a.main;

import java.io.IOException;
import java.util.ArrayList;

import kr.geomex.collecttionTest.ArrayQueue;
import kr.geomex.exceptionTest.ArrayException;

public class ArrayQueueMain {

	public static void main(String[] args) {

		ArrayQueue aq = new ArrayQueue();

		aq.add(1);
		aq.add(2);
		//aq.add(3);
		//aq.add(4);
		//aq.add(5);

		try {
			System.out.println(aq.delete());
			System.out.println(aq.delete());

			System.out.println("----------------------------------------------------");

			aq.print();
			System.out.println("----------------------------------------------------");
			System.out.println(aq.delete());

		} catch (ArrayException e) {

			System.out.println(e.getMessage());//ArrayException클래스에서 작성한 문자열을 출력

		} catch (Exception e1) {

			System.out.println("에외발생");

		}

		System.out.println("----------------------------------------------------");

		aq.print();

	}

}
