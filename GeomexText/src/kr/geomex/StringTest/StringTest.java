package kr.geomex.StringTest;

public class StringTest {
	String str1 ="java";
	String str0 ="JAVA";
	
	public void test() {
	
	
	String str2=new String("programming");
	System.out.println("st1.length"+str1.length());
	
	String str3= str1.concat(str2);//���ڿ��� ��ģ��
	System.out.println(str3);
	System.out.println("str1�� ������ ����"+str1.charAt(3));
	System.out.println(""+str2.indexOf('g'));//'g'��� ���ڿ��� �ε����� ��� indexOf�Ǵ� ���� ó�� �� ���� ���ڸ� ǥ��
	
	}
	
	
	public void test01() {
		
	
	String str4 = new String("�ż�ȣ");
	String str5 ="�ż�ȣ";
	System.out.println(str4==str5);//���۷��� �� ���� :�� ���� ���ڿ��ε� �ٸ� ���̳����°�?  
	System.out.println(str4.equals(str5));//��ü ��ü��
	
	if(str4.equals(str5)) {
		System.out.println("���ڿ��� ����");
	}
	
	}
	
	public void test02() {
		
	
	System.out.println(str1.toUpperCase());//�빮�ں�ȯ
	System.out.println(str0.toLowerCase());//�ҹ��ں�ȯ
	
	String str6="programming                                   ";
	String str7 =str6.trim();//���ڿ��� ������ ����
	System.out.println(str7);
	System.out.println(str6.length());
	System.out.println(str7.length());
	
	}
	
	
}
