package kr.geomex.a.main;

import java.util.ArrayList;

import kr.geomex.b.collecttionTest.ArrayQueue;

public class Main {

	public static void main(String[] args) {

		ArrayQueue aq = new ArrayQueue();

		aq.add(1);
		aq.add(2);
		aq.add(3);
		aq.add(4);
		aq.add(5);

		System.out.println(aq.delete());

		System.out.println(aq.delete());

		System.out.println("----------------------------------------------------");

		aq.print();

		System.out.println(aq.delete());

		System.out.println("----------------------------------------------------");

		aq.print();
		
	}

}
