package kr.geomex.a.main;

import kr.geomex.threadQueueTest.Queue;

public class ThreadQueueMain {

	public static void main(String[] args) {

		Queue<String> ss= new Queue<String>(); 
		
		ss.add("æ»≥Á«œººø‰");
		ss.add("æ»≥Á«œººø‰1");
		ss.add("æ»≥Á«œººø‰2");
		ss.add("æ»≥Á«œººø‰3");
		ss.remove();
		System.out.println(ss.peek());
		System.out.println(ss.peek());
		System.out.println(ss.peek());
	}

}
