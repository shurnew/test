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
					System.out.println("�����߻�");
			}
			}
			contents = value;
			System.out.println("������ ----------: ����" + contents);
			notify();
			available = true;
		
	}
	
	public synchronized int get() {
		

		while (available == false) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("�����߻�");
			}
			System.out.println("�Һ��� ----------: �Һ�" + contents);
		}
		
		notify();
		
		available =false;
		return contents;
	}
}
