package kr.geomex.calculationTest;

public class ArithmeticOPTest02 {

	public static void main(String[] args) {
		byte a= 127,b=2;
		byte c=(byte)(a*b);
		int d= (a*b);
		System.out.println("a*b결과를 byte형식으로출력"+c);
		System.out.println("a*b결과를 int형식으로출력"+d); 

		int i =1000000,j=1000000; 
		int k =i*j;
		System.out.println(k);
		long m =(long)(i*j);
		System.out.println(m);
		long l=(long)i*(long)j;
		System.out.println(l);
		
	}

}
