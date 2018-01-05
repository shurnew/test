package kr.geomex.a.main;

import kr.geomex.abstractTest.Circle;
import kr.geomex.abstractTest.Triangle;

public class AbstractMain {

	public static void main(String[] args) {

		Circle c1 = new Circle();
		Triangle t1 = new Triangle();

		c1.draw();
		try {
		
		c1.calculate(4, 4);	
		
		}catch(ArithmeticException e) {
			System.out.println("오류발생");
		}

		t1.draw();
	
		t1.calculate(5, 4);
	
	}
}
