package kr.geomex.collecttionTest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import kr.geomex.exceptionTest.ArrayException;

public class ArrayQueue {

	ArrayList<Integer> list = new ArrayList<Integer>();

	public void add(int i) {//

		list.add(i);
		
	}

	public Integer delete() throws ArrayException {//ȣ���ϴ��ʿ� ���ܸ� ó���ϵ��� �Ѵ�

		int a = list.size();
		int i = 0;

		if (a > 0) {
			
			i = list.remove(0);
		} else {
			
			throw new ArrayException();// ���ܸ� �߻���Ų��
		}

		return i;
	}

	public void print() {

		Iterator<Integer> ai = list.iterator();

		while (ai.hasNext()) {

			System.out.println(ai.next());
		}
	}

}
