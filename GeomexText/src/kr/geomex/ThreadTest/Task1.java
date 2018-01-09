package kr.geomex.ThreadTest;

public class Task1 extends Thread {

	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println(i+"¹Ýº¹Áß task1");
			try {
				sleep(10);
			}catch (InterruptedException e) {
				
			}
		}
		
	}
}
