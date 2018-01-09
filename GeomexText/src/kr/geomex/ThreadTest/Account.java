package kr.geomex.ThreadTest;

public class Account extends Thread {

	int total= 0;

	public synchronized void deposit() {
		 total=total+1000;
	}
	int gettotal() {
		return total; 
	}
}
