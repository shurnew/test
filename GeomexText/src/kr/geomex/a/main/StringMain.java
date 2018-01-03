package kr.geomex.a.main;

import kr.geomex.b.stringTest.StringBf;
import kr.geomex.b.stringTest.StringTest;
import kr.geomex.b.stringTest.Tokenizer;

public class StringMain {

	public static void main(String[] args) {
		
		
		/*
		StringTest st=new StringTest();
		
		st.test();//문자열을 합치거나 길이 ,특정인덱스의 문자,특정 문자의 인덱스값을 찾는 메소드
		
		st.test01();//레퍼런스비교 ,객체의 비교를 담당하는 메소드     질문: 오브젝트와  인스턴스의 개념의 차이란 무엇인가?
		
		st.test02();//변수의담긴문자열을 대소문자로 변환하거나 공백을 제거하는 메소드
		 
		*/
		
		/**
		 * Stringbuffer를 사용하여  문자열을 추가삭제 하는 프로그램
		 */
		
		/*
		StringBf sb= new StringBf();
		
		String str=new String();
		
		sb.test();
		
		str=sb.append("신선호0000");
		
		System.out.println(str);
		
		str=sb.substring(0,3);
		
		System.out.println(str);
		*/
		
		
		/**
		 * StringTokenizer 예제
		 */
		
		Tokenizer st =new Tokenizer();
		 
		st.test();
		
		System.out.println("---------------------------------------");
		
		st.add("12-52-95-890-44485-4585-125");
		
		st.print();
		
	}

}
