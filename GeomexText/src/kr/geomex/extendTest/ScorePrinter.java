package kr.geomex.extendTest;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class ScorePrinter extends StudentData {

	TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
	NavigableMap<Integer, String> nm = tm.descendingMap();// 정렬된 값을 반전시킨다
 
	@Override
	public void print() {// 오버라이딩 

		Set<Map.Entry<String, Integer>> count = map.entrySet();
		Set<Map.Entry<Integer, String>> count1 = nm.entrySet();

		for (Map.Entry<String, Integer> entry : count) {// 부모클래스의 맵의 키값과 value값을 바꿔서 tm treemap에 넣어준다
			tm.put(entry.getValue(), entry.getKey());
		}

		for (Map.Entry<Integer, String> entry : count1) {// 맵을 출력해주는 구문

			System.out.println(entry.getValue() + " : " + entry.getKey());
		}
	}

	public void superPrint() {//기존 부모클래싀의 메소드를 사용
		super.print();
	}
}
