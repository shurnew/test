package kr.geomex.ThreadTest;

public class Aution extends Thread{

	Notebook nb;
	
	public void delivery(Notebook nb) {
		setName("¿Á¼Ç :");
		this.nb= nb;	
	}
	
	@Override
	public void run() {
		
		nb.delivery(5);
	}
	
}
