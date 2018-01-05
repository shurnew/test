package kr.geomex.abstractTest;

public class Triangle extends Shape {

	@Override
	public void calculate(int a, int b) {
		try {
			if(a!=0&&b!=0) {
			show(a,b);
			System.out.println("삼각형의 넓이" + (a * b / 2));
			}else {
				throw new ArithmeticException();
			}
			
		} catch (ArithmeticException e) {
			System.out.println("오류발생");
		} finally {
			System.out.println("반드시 실행되는 부분");
		}

	}

	@Override
	public void draw() {

		System.out.println("삼각형을 그렸습니다");
	}

	@Override
	public void test() {
		//일반클래스에서 구현
		
	}
	
}
