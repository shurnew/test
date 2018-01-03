package kr.geomex.calculationTest;

public class RelationalOPTest {

	
		byte a=20;
		double d = 3.14;
		boolean fag;
		
		public void print() {
		fag=a> d;
		System.out.println("a가 d보다큰가"+fag);
		fag=a ==20.0f;
		System.out.println("a가20.0f와같은가?"+fag);
		fag=(10!=10);
		System.out.println("10과10이 같지않은가?"+fag);
		fag=10<=20;
		System.out.println("10이 20보다작건 같은가?"+fag);
		System.out.println("10이20보다작은가?"+(10<20));//출력문에서 직접관계연산식을 사용할수있다
		System.out.println("10이20보다크거나같은가?"+(10>=20));
		
		
				
		
	}

}
