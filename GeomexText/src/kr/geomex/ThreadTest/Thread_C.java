package kr.geomex.ThreadTest;

public class Thread_C extends Thread {

	public Thread_C() {
		// setPriority(10);
		}

	@Override
	public void run() {
		System.out.println("C�켱����="+getPriority());
		
	}

}
