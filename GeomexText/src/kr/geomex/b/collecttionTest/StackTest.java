package kr.geomex.b.collecttionTest;

import java.util.Stack;

public class StackTest {
	Stack<Integer> st=new Stack<Integer>();
	
	public void push(int i) {
		st.push(i);//요소를 스택 제일 상단에 삽입
		
	}
	
	public Integer pop() {
		//제일 위의(가장 나중에 삽입된) 요소의 반환과 삭제
		return (st.pop()) ;
	}
	
	public Integer peek() {
		//제일 위의 스반환과 삭제
		return (st.peek()) ;
	}
	
	public void print() {
		System.out.println(st);
		
	}

	public void search(int index) {
		System.out.println(st.search(index));
		
		
	}
	
}
