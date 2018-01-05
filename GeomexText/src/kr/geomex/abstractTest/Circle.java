package kr.geomex.abstractTest;

public class Circle extends Shape  {

	@Override
	public void draw() {
		System.out.println("원을그렸습니다");
		
	}

	@Override
	public void calculate(int a,int b) throws ArithmeticException {
		if(a!=0&&b!=0) {
		show(a,b);
		System.out.println("원의 넓이"+(3.14*a*b));
		}else {
			throw new ArithmeticException();
		}
	}

	@Override
	public void test() {
		
		
	}

	
}
