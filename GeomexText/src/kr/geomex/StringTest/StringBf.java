package kr.geomex.StringTest;

public class StringBf {
	
	StringBuffer sb= new StringBuffer();
	
	public void test() {
		
		sb.append("JAVA");
		System.out.println(sb.toString());
		sb.append("programming");
		System.out.println(sb.toString());//toString()�޼ҵ�� ��ü�� ������ �ִ� ������ ������ ���ڿ��� ����� �����ϴ� �޼ҵ�
		sb.replace(0, 4, "C++");//���ϴ� �ε��������� �����͸� �ڸ��� ���ο� ���ڿ��� ���� 
		System.out.println(sb);
		sb.reverse();//���ڿ��� ������ �����Ѵ�
		System.out.println(sb);
		String str=sb.substring(11);//substring(������,����������)���ϴ� ���� ������ ���ڿ��� �ڸ���
		System.out.println(str);
		
	}
	
	public String append(String s) {
		sb.append(s);
		String str= sb.toString();
		System.out.println(s+"�� ���������� �߰��Ǿ����ϴ�");
		
		return str;
	}
	
	public String substring(int s,int e) {
		String str= sb.substring(s,e);
		
		return str;
	}
	
	
}
