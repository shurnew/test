package kr.geomex.ThreadTest;

public class Amazon extends Thread {

	Notebook nb;
	
	public void delivery(Notebook nb) {
		setName("�Ƹ��� :");
		this.nb= nb;	
	}
	
	@Override
	public void run() {
		
		nb.delivery(10);
	}
}
