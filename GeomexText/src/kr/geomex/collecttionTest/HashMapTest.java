package kr.geomex.collecttionTest;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class HashMapTest {

	   HashMap<String, String> map = new HashMap<String,String>();//데이터의 순서를 보장하지않는다
	   //LinkedHashMap<String, String> map = new LinkedHashMap<String,String>();//추가한순서를 보장
	   //TreeMap<String, String> map = new TreeMap<String,String>();//키값의 순서대로 정렬
	  
	   public void put(String key,String var) {
		   map.put(key,var);
	   }
	   
	   public String get(String key) {
		 
		   return(map.get(key));
	   }
	   
	   public  void print() {
		   System.out.println(map);
	   }
	   
}
