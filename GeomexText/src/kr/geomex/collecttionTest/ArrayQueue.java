package kr.geomex.collecttionTest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayQueue {

	ArrayList<Integer> list = new ArrayList<Integer>();

	public void add(int i) {// throws Exception

		list.add(i);
		// throw new IOException();//���ܸ� �߻���Ų

	}

	public Integer delete() {

		int a = list.size();
		int i = 0;

		try {

			i = list.remove(0);

		} catch (Exception e) {
			
			e.printStackTrace();
			
			System.out.println("������");

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
