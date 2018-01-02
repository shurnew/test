package kr.geomex.dataTypeTest;

public class FloatDoubleText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a=0.1234567890123457890f;//float형은  마지막에 f을 붙여야한다 9자리까지표시
		double b=0.1234567901234567890;//double형은 소수점18자리까지표현가능
		System.out.println(a);
		System.out.println(b);
		float c=1.0f/3.0f;//소수점9자리를 벗어날때 뒤의 숫자를 올림한다
		double d=1.0/3.0;
		System.out.println(c);
		System.out.println(d);
		float e=1.0f/7.0f;
		System.out.println(e);
		double f=1.0/7.0;
		System.out.println(f);
	}

}
