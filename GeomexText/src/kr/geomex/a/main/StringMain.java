package kr.geomex.a.main;

import kr.geomex.b.stringTest.StringBf;
import kr.geomex.b.stringTest.StringTest;
import kr.geomex.b.stringTest.Tokenizer;

public class StringMain {

	public static void main(String[] args) {
		
		
		/*
		StringTest st=new StringTest();
		
		st.test();//���ڿ��� ��ġ�ų� ���� ,Ư���ε����� ����,Ư�� ������ �ε������� ã�� �޼ҵ�
		
		st.test01();//���۷����� ,��ü�� �񱳸� ����ϴ� �޼ҵ�     ����: ������Ʈ��  �ν��Ͻ��� ������ ���̶� �����ΰ�?
		
		st.test02();//�����Ǵ�乮�ڿ��� ��ҹ��ڷ� ��ȯ�ϰų� ������ �����ϴ� �޼ҵ�
		 
		*/
		
		/**
		 * Stringbuffer�� ����Ͽ�  ���ڿ��� �߰����� �ϴ� ���α׷�
		 */
		
		/*
		StringBf sb= new StringBf();
		
		String str=new String();
		
		sb.test();
		
		str=sb.append("�ż�ȣ0000");
		
		System.out.println(str);
		
		str=sb.substring(0,3);
		
		System.out.println(str);
		*/
		
		
		/**
		 * StringTokenizer ����
		 */
		
		Tokenizer st =new Tokenizer();
		 
		st.test();
		
		System.out.println("---------------------------------------");
		
		st.add("12-52-95-890-44485-4585-125");
		
		st.print();
		
	}

}
