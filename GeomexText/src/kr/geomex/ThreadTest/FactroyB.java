package kr.geomex.ThreadTest;

public class FactroyB extends Thread {
	
	Ball ball=null;
	
	public void makeBall(Ball ball) {
		this.setName("FactroyB");
		this.ball=ball;
	}
	
	@Override
	public void run() {
		ball.makeBall(100);
	}
}
