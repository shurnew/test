package kr.geomex.abstractTest;

public class Triangle extends Shape {

	@Override
	public void calculate(int a, int b) {
		try {
			if(a!=0&&b!=0) {
			show(a,b);
			System.out.println("�ﰢ���� ����" + (a * b / 2));
			}else {
				throw new ArithmeticException();
			}
			
		} catch (ArithmeticException e) {
			System.out.println("�����߻�");
		} finally {
			System.out.println("�ݵ�� ����Ǵ� �κ�");
		}

	}

	@Override
	public void draw() {

		System.out.println("�ﰢ���� �׷Ƚ��ϴ�");
	}

	@Override
	public void test() {
		//�Ϲ�Ŭ�������� ����
		
	}
	
}
