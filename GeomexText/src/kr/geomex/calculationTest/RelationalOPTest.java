package kr.geomex.calculationTest;

public class RelationalOPTest {

	
		byte a=20;
		double d = 3.14;
		boolean fag;
		
		public void print() {
		fag=a> d;
		System.out.println("a�� d����ū��"+fag);
		fag=a ==20.0f;
		System.out.println("a��20.0f�Ͱ�����?"+fag);
		fag=(10!=10);
		System.out.println("10��10�� ����������?"+fag);
		fag=10<=20;
		System.out.println("10�� 20�����۰� ������?"+fag);
		System.out.println("10��20����������?"+(10<20));//��¹����� �������迬����� ����Ҽ��ִ�
		System.out.println("10��20����ũ�ų�������?"+(10>=20));
		
		
				
		
	}

}
