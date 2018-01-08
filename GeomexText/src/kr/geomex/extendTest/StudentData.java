 package kr.geomex.extendTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.swing.text.html.HTMLDocument.Iterator;

public class StudentData  {

	TreeMap<String, Integer> map = new TreeMap<String, Integer>();
	
	public void add(String key,Integer var) {
		map.put(key, var);
	}

	public void delete(String key) { 
		map.remove(key);
	}

	public void print() {
		Set<Map.Entry<String, Integer>> count = map.entrySet();
		for (Map.Entry<String, Integer> entry : count) {// entry�� count���� ���� ���ʴ뵵 �ִ´� ���� ���� ������ ���� ����: �̱������� ���ͷ����ͻ��Ұ�
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
	}
}
