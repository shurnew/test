package kr.geomex.a.main;

import kr.geomex.ThreadTest.Account;
import kr.geomex.ThreadTest.Factroy;

import kr.geomex.ThreadTest.Task;
import kr.geomex.ThreadTest.Task1;
import kr.geomex.ThreadTest.ThreadTest;

public class ThreadMain {

	public static void main(String[] args) throws InterruptedException {
		
	/*	Runnable task=new Task();
		Thread t=new Thread(task);
		Task1 t1=new Task1();
		t.start();
		t.join();
		t1.start();*/
		
		
//		Account a=new Account();
//		
//		a.start();
		
		/*
		Factroy f =new Factroy();
		
		
		f.aBall(10);
	
		
		f.start();*/
		
		for (int i = 0; i <=5 ; i++) {
			ThreadTest t=new ThreadTest(i);
			t.start();
			//t.join();
		}
		
		
		
	}

}
