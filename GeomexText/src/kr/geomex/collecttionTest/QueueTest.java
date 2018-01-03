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
		return qu.poll();//element()메소드는 해당데이터가 존재하지않을때 NoSuchElementException 오류를 호출
	}
	
	public void print(){
		Iterator ai = qu.iterator();
		while(ai.hasNext()) {
			 
			System.out.println(ai.next());
		}
	}
	
}
