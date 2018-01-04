package kr.geomex.a.main;

import kr.geomex.overLoddingTest.Calculation;
import kr.geomex.overLoddingTest.Calculation1;

public class CalculationMain {

	public static void main(String[] args) {
		
		Calculation1 cal= new Calculation1();
		int a[]=new int[5];
		
		a[0]=cal.sum(6, 4);
		a[1]=cal.sub(6, 4);
		a[2]=cal.mul(6, 4);
		a[3]=cal.div(6, 4);
		
		
		//평균구하기
		cal.insert(50,90,40);
		cal.insert(90,40);
		cal.insert(90);
		a[4]=cal.average();
		for(int i=0;i<a.length;i++) {
		System.out.println("사칙연산 :"+a[i]);
		}
		
		
	}

}
