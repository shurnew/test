package kr.geomex.collecttionTest;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class HashMapTest {

	   HashMap<String, String> map = new HashMap<String,String>();//�������� ������ ���������ʴ´�
	   //LinkedHashMap<String, String> map = new LinkedHashMap<String,String>();//�߰��Ѽ����� ����
	   //TreeMap<String, String> map = new TreeMap<String,String>();//Ű���� ������� ����
	  
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
