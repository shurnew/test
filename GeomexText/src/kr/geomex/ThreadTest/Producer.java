package kr.geomex.ThreadTest;

public class Producer extends Thread{
	Buffer b;

	public Producer(Buffer b) {
		this.b = b;
		
	}
	
	 @Override
	public void run() {
		 for (int i = 1; i <= 10; i++) {
			
			 b.put(i);
		}
	}
}
