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
			System.out.println("1���޼ҵ�");
		System.out.println("¦���Դϱ�? Ȧ���Դϱ�?");
		
		if(i%2==0){
			
			System.out.println("¦���Դϴ�");
		}else {
			
			System.out.println("Ȧ���Դϴ�");
		}
		}
		
	public int print(int i){//��Ȱ�� ������ i�k ���� 
		
		
		System.out.println("2���޼ҵ�");
		for(int j=0; j<=i;j+=10){
		
			if(i==j) {
				
			}
		}
		
			
	return i;	//�������� ��ȯ
	}
		
}
