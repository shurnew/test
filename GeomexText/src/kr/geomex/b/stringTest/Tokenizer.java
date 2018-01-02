package kr.geomex.b.stringTest;

import java.util.StringTokenizer;

public class Tokenizer {
	
	StringTokenizer st1= new StringTokenizer("홍길동 박기정 최기정");//분리자 공백
	
	StringTokenizer st2= new StringTokenizer("2017-12-31","-");// 분리자-
	
	int tokencount =st2.countTokens();
	
	public void test() {
		
		System.out.println("코큰 개수 ="+tokencount);
		
		while(st2.hasMoreTokens()) {//다음 토큰 이 존재할때 true 값을 반홙
			System.out.println(st2.nextToken());
		}
		
		//토큰을 포함해서 분리
		StringTokenizer st3= new StringTokenizer("2017-12-31","-",true);
		while(st3.hasMoreTokens()) {//다음 토큰 이 존재할때 true 값을 반홙
			System.out.println(st3.nextToken());
		}
	}
	
	
	
}
