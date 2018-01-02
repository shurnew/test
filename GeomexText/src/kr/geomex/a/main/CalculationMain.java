package kr.geomex.a.main;

import kr.geomex.calculationTest.Calculation;

public class CalculationMain {

	public static void main(String[] args) {
		
		Calculation cal= new Calculation();
		int a[]=new int[5];
		
		a[0]=cal.sum(6, 4);
		a[1]=cal.sub(6, 4);
		a[2]=cal.mul(6, 4);
		a[3]=cal.div(6, 4);
		a[4]=cal.mod(6, 4);
		for(int i=0;i<a.length;i++) {
		System.out.println("사칙연산"+a[i]);
		}
		
		
	}

}
