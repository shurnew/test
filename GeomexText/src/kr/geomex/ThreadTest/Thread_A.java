package kr.geomex.ThreadTest;

public class Thread_A extends Thread {
	
	public Thread_A() {
	// setPriority(1);
	}
	@Override
	public void run() {
		yield();
		System.out.println("A�켱����="+getPriority());
		
		
	}
	
}
