package kr.geomex.ThreadTest;

import java.util.ArrayList;
import java.util.Random;

public class ThreadTest extends Thread {

	int a = 0;

	public ThreadTest(int i) {
		this.a= i;
	}

	@Override
	public void run() {
		System.out.println(a + "�������� ������");
		
		try {
			
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println(a+"�������� ��������");
	}

}