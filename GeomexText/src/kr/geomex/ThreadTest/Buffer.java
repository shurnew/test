package kr.geomex.ThreadTest;

import java.io.InterruptedIOException;

public class Buffer {
	int contents;
	boolean available = false;

	public synchronized void put(int value) {
		
			while (available == true) {
			try {
				
				wait();
				
			} catch (InterruptedException e) {
					System.out.println("오류발생");
			}
			}
			contents = value;
			System.out.println("생산자 ----------: 생산" + contents);
			notify();
			available = true;
		
	}
	
	public synchronized int get() {
		

		while (available == false) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("오류발생");
			}
			System.out.println("소비자 ----------: 소비" + contents);
		}
		
		notify();
		
		available =false;
		return contents;
	}
}
