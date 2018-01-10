package kr.geomex.ThreadTest;

public class Thread_B extends Thread {

	public Thread_B() {
		// setPriority(5);
	}

	@Override
	public void run() {
		yield();
		System.out.println("B우선순위=" + getPriority());

	}

}
