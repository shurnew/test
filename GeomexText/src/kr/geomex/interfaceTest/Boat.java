package kr.geomex.interfaceTest;

import java.util.ArrayList;

public class Boat implements BoatManual, Print {

	ArrayList<Integer> list = new ArrayList<Integer>();

	@Override
	public void print() {
		System.out.println("A지역의 총인원은" + list.get(0) + "명입니다");
		System.out.println("B지역으로 건널수있는 배를 움직일수있는 최대최소탑승 인원은" + MEX_COUNT + "입니다");
		System.out.println("현재인원을 이동시키는 데 필요한 반복횟수는 " + list.get(1) + "입니다");
		System.out.println("배에 탑승하지 못하고 A지역에 남은 인원은 " + list.get(2));
		System.out.println("배에 탑승하여 B지역으로 이동한 인원은 " + list.get(3));
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
