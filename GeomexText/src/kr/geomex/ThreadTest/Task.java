package kr.geomex.ThreadTest;

public class Task implements Runnable{
	
	
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i+"�ݺ���");
			try {
				Thread.sleep(10);
			}catch (InterruptedException e) {
				
			}
		}
		
	}

}
