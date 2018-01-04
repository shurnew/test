package kr.geomex.collecttionTest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayQueue {

	ArrayList<Integer> list = new ArrayList<Integer>();

	public void add(int i) throws Exception {
		
		list.add(i);
		throw new IOException();

	}
	
	public Integer delete() throws Exception {
		int a = list.size();
		int i = 0;
		
		if (a >= 0) {
			
			i = list.remove(0);
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
