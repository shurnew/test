package kr.geomex.dataTypeTest;

public class NumericTypeError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long h= 10000000000010L;
		System.out.println(h);
		int g= (int)h;
		System.out.println("int변환"+g);
		short f= (short)g;
		System.out.println("short변환"+f);
		byte e =(byte)f;
		System.out.println("byte변환"+e);
		
		
	/** 결과값은  아래값과 같고 변환 도중에 데이터값이 오버 하면서 오버플로우현상이 일어난다(2진수 코드가 넘치는 만큼 밀려는현상) 
	*10000000000010
	*int변환1316134922
	*short변환-24566
	*byte변환10
	**/
		
	}

}
