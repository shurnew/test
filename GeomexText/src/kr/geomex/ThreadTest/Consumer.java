package kr.geomex.ThreadTest;

public class Consumer extends Thread {

	Buffer b;

	public Consumer(Buffer b) {
		this.b = b;

	}

	@Override
	public void run() {
		int value = 0;
		for (int i = 1; i <= 10; i++) {
			value = b.get();
		}
	}
}
