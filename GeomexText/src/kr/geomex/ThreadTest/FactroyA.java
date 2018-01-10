package kr.geomex.ThreadTest;

public class FactroyA extends Thread {

	
	Ball ball=null;
	
	public void makeBall(Ball ball) {
		this.setName("FactroyA");
		this.ball=ball;
	}
	
	@Override
	public void run() {
		ball.makeBall(20);
	}
}
