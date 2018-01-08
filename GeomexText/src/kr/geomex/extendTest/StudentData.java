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
		for (Map.Entry<String, Integer> entry : count) {// entry에 count안의 값을 차례대도 넣는다 다음 값이 없을때 까지 질문: 이구문에서 이터레이터사용불가
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
	}
}
