package kr.geomex.a.main;

import kr.geomex.threadQueueTest.Queue;

public class ThreadQueueMain {

	public static void main(String[] args) {

		Queue<String> ss= new Queue<String>(); 
		
		ss.add("�ȳ��ϼ���");
		ss.add("�ȳ��ϼ���1");
		ss.add("�ȳ��ϼ���2");
		ss.add("�ȳ��ϼ���3");
		ss.remove();
		System.out.println(ss.peek());
		System.out.println(ss.peek());
		System.out.println(ss.peek());
	}

}
