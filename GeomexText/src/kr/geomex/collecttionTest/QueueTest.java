package kr.geomex.collecttionTest;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class QueueTest {
	LinkedList<Integer> qu = new LinkedList<Integer>();
	//Deque<Integer> qu = new ArrayDeque<Integer>();
	
	public void add(int i) {
		qu.add(i);
	}
	
	public Integer poll() {
		return qu.poll();//element()�޼ҵ�� �ش絥���Ͱ� �������������� NoSuchElementException ������ ȣ��
	}
	
	public void print(){
		Iterator ai = qu.iterator();
		while(ai.hasNext()) {
			 
			System.out.println(ai.next());
		}
	}
	
}
