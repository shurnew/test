package kr.geomex.overLoddingTest;

import java.util.ArrayList;

public class Calculation1 extends Calculation {

	ArrayList<Integer>al=new ArrayList<Integer>();
	
	public void insert(int a) {

		al.add(a);
		
	}
	
	public void insert(int a,int b) {

		al.add(a);
		al.add(b);
	}
	
	public void insert(int a,int b,int c) {

		al.add(a);
		al.add(b);
		al.add(c);
	}
	
	public Integer average() {
		int a = 0; 
		for(int i=0; i<al.size();i++) {
			
			a= a+al.get(i);	
		}
		
		int i = a/al.size();
		al.clear();
		return i;
	}
}
