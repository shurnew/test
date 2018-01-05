package kr.geomex.z.student
;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Question {

	HashSet<String> set1 = new HashSet<String>();
	HashSet<String> set2 = new HashSet<String>();
	HashSet<String> set3 = new HashSet<String>();
	HashSet<String> resSet = new HashSet<String>();
	
	public void setInit() {
		
		set1.add("포도");
		set1.add("딸기");
		set1.add("키위");
		
		set2.add("아메리카노");
		set2.add("카페라떼");
		set2.add("에스프레소");
		
		set3.add("닭갈비");
		set3.add("막국수");
		set3.add("만두국");		
	}
	
	public void chooeseSet(HashSet<String> s1, Set s2) {
							
		Set t1 = s1;
		Set t2 = s2;
		
		resSet.addAll(t1);
		resSet.addAll(t2);
		
	}
	
	public void print() {
		
		System.out.println(resSet);
	}
	
	
}
