package kr.geomex.calculationTest;

public class TernayOPTest {

	int i=7;
	boolean j;
	
	public void print(){
		System.out.println(i+"�� ¦���Դϱ�?");
		
		j=(i%2==0)?true:false;
		
		System.out.println(j);
		
		System.out.println(i+"�� Ȧ���Դϱ�?");
		
		j=(i%2<=1)?true:false;
		
		System.out.println(j);
		
	}

}
