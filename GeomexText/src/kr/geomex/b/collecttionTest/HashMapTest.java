package kr.geomex.b.collecttionTest;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.swing.text.html.HTMLDocument.Iterator;

public class HashMapTest {

	   HashMap<String, Student> map = new HashMap<String,Student>();//�������� ������ ���������ʴ´�
	   //LinkedHashMap<String, String> map = new LinkedHashMap<String,String>();//�߰��Ѽ����� ����
	   //TreeMap<String, String> map = new TreeMap<String,String>();//Ű���� ������� ����
	  
	   public void put(String key,Student var) {
		   map.put(key,var);
	   }
	   
	   public Student get(String key) {
	//	 String s=( map.get(key)).toString();
		   return ( map.get(key));
	   }
	  
	   public  void print() {
		   Set<Map.Entry<String,Student>> entries = map.entrySet();//Entry��� �������̽��ȿ� ���ǵ� getkey�� getvalue�޼ҵ� 
		  // System.out.println(map.toString());
		   for (Map.Entry<String,Student> entry : entries) {//entries�ȿ����� entry�ȿ��־������� �����ִµ��� �ݺ�
	            System.out.println(entry.getKey() + " : " + entry.getValue());
	        }
		   
	   }
		 
	  
}
