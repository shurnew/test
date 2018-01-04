package kr.geomex.a.main;

import kr.geomex.abstractTest.Circle;
import kr.geomex.abstractTest.Triangle;

public class AbstractMain {

	public static void main(String[] args) {

		Circle c1 = new Circle();
		Triangle t1 = new Triangle();

		c1.draw();
		c1.calculate(3, 5);

		t1.draw();
		t1.calculate(4, 5);
	}
}
