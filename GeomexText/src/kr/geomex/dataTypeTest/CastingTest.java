package kr.geomex.dataTypeTest;

public class CastingTest {

	public static void main(String[] args) {

		byte b=120;
		int i= b;
		System.out.println("Ȯ������ȯ"+i);
		int j=259;
		double d=259.428;
		System.out.println("�������ȯ");
		b=(byte)j;//int>byte
		System.out.println(b);
		i=(int)d;//double>int
		System.out.println(i);
		b=(byte)d;//double>byte
		System.out.println(b);
		 
	}

}
