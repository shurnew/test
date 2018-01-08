package kr.geomex.extendTest;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class ScorePrinter extends StudentData {

	TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
	NavigableMap<Integer, String> nm = tm.descendingMap();// ���ĵ� ���� ������Ų��
 
	@Override
	public void print() {// �������̵� 

		Set<Map.Entry<String, Integer>> count = map.entrySet();
		Set<Map.Entry<Integer, String>> count1 = nm.entrySet();

		for (Map.Entry<String, Integer> entry : count) {// �θ�Ŭ������ ���� Ű���� value���� �ٲ㼭 tm treemap�� �־��ش�
			tm.put(entry.getValue(), entry.getKey());
		}

		for (Map.Entry<Integer, String> entry : count1) {// ���� ������ִ� ����

			System.out.println(entry.getValue() + " : " + entry.getKey());
		}
	}

	public void superPrint() {//���� �θ�Ŭ������ �޼ҵ带 ���
		super.print();
	}
}
