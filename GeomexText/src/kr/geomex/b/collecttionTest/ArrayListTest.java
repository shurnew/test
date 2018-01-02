package kr.geomex.b.collecttionTest;

import java.util.*;

public class ArrayListTest {

	ArrayList<String> list= new ArrayList<String>();
	
	int num=0;
	
	public void add(String s) {
		
		list.add(s);
		
		num =list.size();
		/*for(int cnt=0;cnt<num;cnt++) {
			
			String str=list.get(cnt);
			System.out.println(str);
		}*/
	} 
	
	public String get(int i) {
		String str =null;
		if(i<num) {
		 str=list.get(i);
		}
		else {
			System.out.println("해당 인덱스의  값이  없습니다");
		}
		
		return str;
	}
	
	
	public void remove(int i) {
		
		list.remove(i);
		
		num =list.size();
		
	}
	
	
	public void print() {
		Iterator ai = list.iterator();
		while(ai.hasNext()) {
			 
			System.out.println(ai.next());
		}
		
	}
	
	
	
}
