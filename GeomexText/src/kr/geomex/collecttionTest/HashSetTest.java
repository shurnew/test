package kr.geomex.collecttionTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {
		public HashSet<Integer> set1 = new HashSet<Integer>();
		public HashSet<Integer> set2 = new HashSet<Integer>();
		public HashSet<Integer> set3 = new HashSet<Integer>();
		HashSet<Integer> a = new HashSet<Integer>();
		HashSet<Integer> b = new HashSet<Integer>();
	  
	  
	  
	  public void add(String index,int var) {
		  
		  switch(index) {
		  case "a": 
			  set1.add(var);
			  break;
			 
		  case "b":
			  set2.add(var);
			  break;
		  case "c":
			  set3.add(var);
			  break;
			  
			  default:System.out.println("'a , b , c + �� '���� �Է����ּ���");
				  
		  }
	  }
	  
	  public void contains() {
		  
		  //���� : �콬������ ������  ��ü������  �迭�ȿ� �־� ȣ���Ҽ��ִ¹��?
		  System.out.println("b��a�� �κ������ΰ�?");
		   System.out.println(set1.containsAll(set2));
		   
		   System.out.println("c��a�� �κ������ΰ�?");
		   System.out.println(set1.containsAll(set3));
		   
	  }
	  
	  public void addall(HashSet<Integer>s1 , HashSet<Integer> s2) {
		 
		/*chack1(index);
		 
		chack2(index2);*/
		 
		 
		
		 s1.addAll(s2);
		 System.out.println(s1);
	  }
	  
	  
	  
	  public void retain(String index ,String index2) {
			 
		
		  
		  chack1(index);
		 
		  chack2(index2);
		
		 a.retainAll(b);
		 System.out.println(a);
	  }
	  
	  
	  public void remove(HashSet s1 ,HashSet s2) {
			 
		 /* chack1(index);
			 
		  chack2(index2);*/
		  
		 s1.removeAll(s2);
		 System.out.println(s1);
	  }
	  
	 
	  public void print(String index){
			 Iterator s1=set1.iterator();
			 Iterator s2=set2.iterator();
			 Iterator s3=set3.iterator();
			
			 switch(index) {
			  
			 case "a": 
				  System.out.println("a�� ������� :"+set1.size());
				  while(s1.hasNext()) {
					  
					  
					  System.out.println(s1.next());
				  
				  }
				  
				  break;
				 
			  case "b":
				  System.out.println("b�� ������� :"+set2.size());
				  while(s2.hasNext()) {
					  
					  System.out.println(s2.next());
				  
				  }
				  
				  break;
			  
			  case "c":
				  System.out.println("c�� ������� :"+set3.size());
				  while(s3.hasNext()) {
					 
					  System.out.println(s3.next());
				  
				  }
				  
				  break;
				  
				  default:System.out.println("'a , b , c '���� �Է����ּ���");
					  
			  }
			  
		  }
	  
	  public void chack1(String index) {
		 
		 
		  
		  switch(index) {
		  
		  case "a": 
			  a= set1;
			  break;
			 
		  case "b":
			  a= set2;
			 
			  break;
			  
		  case "c":
			  a= set3;
			  break;
			  
			  default:System.out.println("'a , b , c '���� �Է����ּ���");
				  
		  }
		 
	  }
	  public void chack2(String index) {
		 
		 
		  
		  switch(index) {
		  
		  case "a": 
			  b= set1;
			  break;
			 
		  case "b":
			  b= set2;
			 
			  break;
			  
		  case "c":
			  b= set3;
			  break;
			  
			  default:System.out.println("'a , b , c '���� �Է����ּ���");
				  
		  }
		 
	  }
		  
	  
	  
}
