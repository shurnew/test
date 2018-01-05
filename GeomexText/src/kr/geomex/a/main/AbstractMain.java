package kr.geomex.a.main;

import java.awt.Shape;

import kr.geomex.abstractTest.Circle;
import kr.geomex.abstractTest.Triangle;

public class AbstractMain {

	public static void main(String[] args) {

		Circle c = new Circle();
		//Triangle t1 = 

		c.draw();
		try {
		
		c.calculate(4, 4);	
		
		}catch(ArithmeticException e) {
			System.out.println("오류발생");
		}
		
		
				
		c.draw();
	
		c.calculate(5, 4);
	
	}
}
