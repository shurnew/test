package kr.geomex.calculationTest;

public class LogicalOPTest {

	public  void print() {
		boolean a;
		a=(20>10)||(30>40);//�ΰ��� ������� �Ѵ� ���̰ų� �ϳ������϶� ���̴�
		System.out.println(a);
		a=(20>10)&&(30>40);//�ΰ��� ������� �Ѵ� ���̾�� ��
		System.out.println(a);
		a=!true;//���϶������̰� �����϶����̵ȴ�
		System.out.println(a);
		
		System.out.println("�����ϳ������ΰ�?"+((10<20)||(40<30)));//��¹����� �������迬����� ����Ҽ��ִ�
		System.out.println("�ΰ��ٸ�����ΰ�?"+((10<20)&&(40<30)));
		System.out.println("true��!(not)��?"+(!true));
	}

}
