package kr.geomex.ThreadTest;

public class Factroy extends Thread {

	int ball = 0;

	@Override
	public void run() {
		aBall(50);
		System.out.println(ball);
		bBall(100);
		System.out.println(ball);
		cBall(1000);
		System.out.println(ball);
		dBall(500);
		System.out.println(ball);
		
	}

	public void aBall(int i) {
		this.ball+=i;
		
	}
	public void bBall(int i) {
		this.ball+=i;
		
	}
	public void cBall(int i) {
		this.ball+=i;
		
	}
	public void dBall(int i) {
		this.ball+=i;
		
	}

	
	
	
}
