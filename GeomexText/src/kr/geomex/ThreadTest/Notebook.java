package kr.geomex.ThreadTest;

public class Notebook {

	int stouk;
	
	public synchronized void delivery(int i) {
		
		this.stouk=i;
		
		System.out.println(Thread.currentThread().getName()+stouk+"�� �����");
		
	}
	
}
