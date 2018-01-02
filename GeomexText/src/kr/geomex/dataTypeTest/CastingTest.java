package kr.geomex.dataTypeTest;

public class CastingTest {

	public static void main(String[] args) {

		byte b=120;
		int i= b;
		System.out.println("확대형변환"+i);
		int j=259;
		double d=259.428;
		System.out.println("축소형변환");
		b=(byte)j;//int>byte
		System.out.println(b);
		i=(int)d;//double>int
		System.out.println(i);
		b=(byte)d;//double>byte
		System.out.println(b);
		 
	}

}
