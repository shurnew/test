package kr.geomex.b.controlTest;
import java.util.*;

import kr.geomex.petTest.Pet6;

public class TestMethod {
	
	int i;
	String  s;	
	
	
	
	public TestMethod(){
		
	}
	public TestMethod(String s){
		this.s=s;
		System.out.println(s);
	}
	public TestMethod(int i){
		this.i=i;
	}

		public void print() {
			System.out.println("1번메소드");
		System.out.println("짝수입니까? 홀수입니까?");
		
		if(i%2==0){
			
			System.out.println("짝수입니다");
		}else {
			
			System.out.println("홀수입니다");
		}
		}
		
	public int print(int i){//반활할 정수값 i릏 선언 
		
		
		System.out.println("2번메소드");
		for(int j=0; j<=i;j+=10){
		
			if(i==j) {
				
			}
		}
		
			
	return i;	//정수값을 반환
	}
		
}
