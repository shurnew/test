package kr.geomex.dataTypeTest;

public class StringType {

	public static void main(String[] args) {
		String str1="��!���ѹα�";
		String str2=new String("Korea");
		System.out.println(str1+str2);
		int a=1000;
		int b=2000;
		double c=10.01;
		double d=20.01;
		System.out.println(str1+a+b+"�ݼ�����");//case1 ���ڿ��� ������ ���Ҷ� a,b�� ���ڿ�ó�� ó��
		System.out.println(str1+(a+b)+"�ݼ�����");//case2 ��ȣ�� ������ �켱������ ������� ���ڿ�ó��
		System.out.println(str1+c+d+"�ݼ�����");//case1 ���ڿ��� �Ǽ��� ���Ҷ� c,d�� ���ڿ�ó�� ó��
		System.out.println(str1+(c+d)+"�ݼ�����");//case2 ��ȣ�� �Ǽ��� �켱������ ������� ���ڿ�ó�� 
	}

}
