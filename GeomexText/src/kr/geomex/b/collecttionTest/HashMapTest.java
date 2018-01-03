package kr.geomex.b.collecttionTest;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.swing.text.html.HTMLDocument.Iterator;

public class HashMapTest {

	   HashMap<String, Student> map = new HashMap<String,Student>();//데이터의 순서를 보장하지않는다
	   //LinkedHashMap<String, String> map = new LinkedHashMap<String,String>();//추가한순서를 보장
	   //TreeMap<String, String> map = new TreeMap<String,String>();//키값의 순서대로 정렬
	  
	   public void put(String key,Student var) {
		   map.put(key,var);
	   }
	   
	   public Student get(String key) {
	//	 String s=( map.get(key)).toString();
		   return ( map.get(key));
	   }
	  
	   public  void print() {
		   Set<Map.Entry<String,Student>> entries = map.entrySet();//Entry라는 인터페이스안에 정의된 getkey와 getvalue메소드 
		  // System.out.println(map.toString());
		   for (Map.Entry<String,Student> entry : entries) {//entries안에값을 entry안에넣어줌으로 값이있는동안 반복
	            System.out.println(entry.getKey() + " : " + entry.getValue());
	        }
		   
	   }
		 
	  
}
