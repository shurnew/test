package kr.geomex.ThreadTest;

public class Aution extends Thread{

	Notebook nb;
	
	public void delivery(Notebook nb) {
		setName("���� :");
		this.nb= nb;	
	}
	
	@Override
	public void run() {
		
		nb.delivery(5);
	}
	
}
