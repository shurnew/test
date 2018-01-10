package kr.geomex.a.main;

import kr.geomex.ThreadTest.Account;
import kr.geomex.ThreadTest.Amazon;
import kr.geomex.ThreadTest.Aution;
import kr.geomex.ThreadTest.Ball;
import kr.geomex.ThreadTest.FactroyA;
import kr.geomex.ThreadTest.FactroyB;
import kr.geomex.ThreadTest.Notebook;
import kr.geomex.ThreadTest.Task;
import kr.geomex.ThreadTest.Task1;
import kr.geomex.ThreadTest.ThreadTest;
import kr.geomex.ThreadTest.Thread_A;
import kr.geomex.ThreadTest.Thread_B;
import kr.geomex.ThreadTest.Thread_C;

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
		Ball b=new Ball();
		FactroyA f =new FactroyA();
		FactroyB f1 =new FactroyB();
		
		f.makeBall(b);
		f1.makeBall(b);
		f.start();
	
		f1.start();*/
		
		Notebook n= new Notebook();
		Amazon am =new Amazon();
		Aution au= new Aution(); 
		
		am.delivery(n);
		au.delivery(n);
		au.start();
		am.start();
		
		
		/*for (int i = 0; i <=5 ; i++) {
			ThreadTest t=new ThreadTest(i);
			t.start();
			t.join();
		}*/
		
	/*	
		Thread_A a =new Thread_A();
		Thread_B b =new Thread_B();
		Thread_C c =new Thread_C();
		c.start();
		b.start();
		a.start();*/
		
		
		
	}

}
