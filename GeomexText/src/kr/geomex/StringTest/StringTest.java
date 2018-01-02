package kr.geomex.StringTest;

public class StringTest {
	String str1 ="java";
	String str0 ="JAVA";
	
	public void test() {
	
	
	String str2=new String("programming");
	System.out.println("st1.length"+str1.length());
	
	String str3= str1.concat(str2);//문자열을 합친다
	System.out.println(str3);
	System.out.println("str1의 마지막 문자"+str1.charAt(3));
	System.out.println(""+str2.indexOf('g'));//'g'라는 문자열의 인덱스를 출력 indexOf의는 가장 처음 만 나는 문자만 표시
	
	}
	
	
	public void test01() {
		
	
	String str4 = new String("신선호");
	String str5 ="신선호";
	System.out.println(str4==str5);//레퍼런스 비교 질문 :왜 같은 문자열인데 다른 값이나오는가?  
	System.out.println(str4.equals(str5));//객체 자체비교
	
	if(str4.equals(str5)) {
		System.out.println("문자열이 같다");
	}
	
	}
	
	public void test02() {
		
	
	System.out.println(str1.toUpperCase());//대문자변환
	System.out.println(str0.toLowerCase());//소문자변환
	
	String str6="programming                                   ";
	String str7 =str6.trim();//문자열의 공백을 제거
	System.out.println(str7);
	System.out.println(str6.length());
	System.out.println(str7.length());
	
	}
	
	
}
