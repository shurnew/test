package kr.geomex.dataTypeTest;

public class NumericTypeError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long h= 10000000000010L;
		System.out.println(h);
		int g= (int)h;
		System.out.println("int��ȯ"+g);
		short f= (short)g;
		System.out.println("short��ȯ"+f);
		byte e =(byte)f;
		System.out.println("byte��ȯ"+e);
		
		
	/** �������  �Ʒ����� ���� ��ȯ ���߿� �����Ͱ��� ���� �ϸ鼭 �����÷ο������� �Ͼ��(2���� �ڵ尡 ��ġ�� ��ŭ �з�������) 
	*10000000000010
	*int��ȯ1316134922
	*short��ȯ-24566
	*byte��ȯ10
	**/
		
	}

}
