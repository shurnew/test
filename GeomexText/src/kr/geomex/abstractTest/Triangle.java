package kr.geomex.abstractTest;

public class Triangle extends Shape {

	@Override
	public void calculate(int a, int b) {
		System.out.println("�ﰢ���� ����"+(a*b/2));
		
	}
	
	@Override
	public void draw() {
		
		System.out.println("�ﰢ���� �׷Ƚ��ϴ�");
	}
}
