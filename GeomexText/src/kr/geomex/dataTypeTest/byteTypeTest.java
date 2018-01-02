package kr.geomex.dataTypeTest;

public class byteTypeTest {
/**
 * 마찬가지로 이진수 바이트코드가 넘겨 다른결과값이나온다 
 * 결과값
 * 128을 저장한값은-128
 *	256을 저장한값은0
 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a=(byte)128;
		System.out.println("128을 저장한값은"+a);
		byte b=(byte)256;
		System.out.println("256을 저장한값은"+b);
	}

}
