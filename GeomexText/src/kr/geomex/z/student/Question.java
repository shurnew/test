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
		
		set1.add("����");
		set1.add("����");
		set1.add("Ű��");
		
		set2.add("�Ƹ޸�ī��");
		set2.add("ī���");
		set2.add("����������");
		
		set3.add("�߰���");
		set3.add("������");
		set3.add("���α�");		
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
