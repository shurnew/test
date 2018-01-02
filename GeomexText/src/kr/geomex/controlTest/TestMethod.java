package kr.geomex.controlTest;
import java.util.*;

import kr.geomex.petTest.Pet6;

public class TestMethod {

	//int i=0;	
	Pet6 p =new Pet6();
//	ArrayList al= new ArrayList();
		public void print() {
			System.out.println("1번메소드");
		System.out.println("짝수입니까? 홀수입니까?");
		
		if(p.Population%2==0){
			
			System.out.println("짝수마리있습니다");
		}else {
			
			System.out.println("홀수마리있습니다");
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
