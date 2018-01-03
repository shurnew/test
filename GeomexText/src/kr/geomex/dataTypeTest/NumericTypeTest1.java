package kr.geomex.dataTypeTest;

public class NumericTypeTest1 {
	public static void main(String[] args) {
	
		byte e  = 127;
		short f = e;
		int g	= f;
		long h  = g;
		
		System.out.println(e);
		System.out.println("short변환"+f);		
		System.out.println("int변환"+g);		
		System.out.println("long변환"+h);					
	}
}
