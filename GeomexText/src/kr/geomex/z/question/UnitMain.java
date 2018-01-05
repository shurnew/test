package kr.geomex.z.question;

/**
 * @author 다형성 예제
 */
public class UnitMain {

	
	public static void main(String[] args) {

		Unit unit1 = new Unit(new Gun());
		Unit unit2 = new Unit(new Sword());
	}
}
