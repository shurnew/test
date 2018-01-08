package kr.geomex.interfaceTest;

import java.util.ArrayList;

public class Boat implements BoatManual, Print {

	ArrayList<Integer> list = new ArrayList<Integer>();

	@Override
	public void print() {
		System.out.println("A������ ���ο���" + list.get(0) + "���Դϴ�");
		System.out.println("B�������� �ǳμ��ִ� �踦 �����ϼ��ִ� �ִ��ּ�ž�� �ο���" + MEX_COUNT + "�Դϴ�");
		System.out.println("�����ο��� �̵���Ű�� �� �ʿ��� �ݺ�Ƚ���� " + list.get(1) + "�Դϴ�");
		System.out.println("�迡 ž������ ���ϰ� A������ ���� �ο��� " + list.get(2));
		System.out.println("�迡 ž���Ͽ� B�������� �̵��� �ο��� " + list.get(3));
	}

	@Override 
	public void run(int i) {
		
		int j =0;

		list.add(i);
		j = i/MEX_COUNT;
		list.add(j);
		j = i%MEX_COUNT;
		list.add(j);
		j = i - j;
		list.add(j);

		print();
	}
}
