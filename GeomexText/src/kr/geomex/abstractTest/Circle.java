package kr.geomex.abstractTest;

public class Circle extends Shape  {

	@Override
	public void draw() {
		System.out.println("�����׷Ƚ��ϴ�");
		
	}

	@Override
	public void calculate(int a,int b) throws ArithmeticException {
		if(a!=0&&b!=0) {
		show(a,b);
		System.out.println("���� ����"+(3.14*a*b));
		}else {
			throw new ArithmeticException();
		}
	}

	@Override
	public void test() {
		
		
	}

	
}
