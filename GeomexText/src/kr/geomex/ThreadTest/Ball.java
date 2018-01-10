package kr.geomex.ThreadTest;

public class Ball {

	int ball = 0;

	public int getBall() {

		return ball;
	}

	public synchronized void makeBall(int ball) {
		this.ball = ball;
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			
		}
		System.out.println(Thread.currentThread().getName()+" : "+this.ball);
	}
}
