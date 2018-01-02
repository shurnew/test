package kr.geomex.dataTypeTest;

public class StringType {

	public static void main(String[] args) {
		String str1="아!대한민국";
		String str2=new String("Korea");
		System.out.println(str1+str2);
		int a=1000;
		int b=2000;
		double c=10.01;
		double d=20.01;
		System.out.println(str1+a+b+"금수강산");//case1 문자열을 정수와 합할때 a,b가 문자열처럼 처리
		System.out.println(str1+(a+b)+"금수강산");//case2 괄호로 정수를 우선순위로 계산한후 문자열처리
		System.out.println(str1+c+d+"금수강산");//case1 문자열을 실수와 합할때 c,d가 문자열처럼 처리
		System.out.println(str1+(c+d)+"금수강산");//case2 괄호로 실수를 우선순위로 계산한후 문자열처리 
	}

}
