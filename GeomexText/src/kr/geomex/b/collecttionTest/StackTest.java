package kr.geomex.b.collecttionTest;

import java.util.Stack;

public class StackTest {
	Stack<Integer> st=new Stack<Integer>();
	
	public void push(int i) {
		st.push(i);//��Ҹ� ���� ���� ��ܿ� ����
		
	}
	
	public Integer pop() {
		//���� ����(���� ���߿� ���Ե�) ����� ��ȯ�� ����
		return (st.pop()) ;
	}
	
	public Integer peek() {
		//���� ���� ����ȯ�� ����
		return (st.peek()) ;
	}
	
	public void print() {
		System.out.println(st);
		
	}

	public void search(int index) {
		System.out.println(st.search(index));
		
		
	}
	
}
