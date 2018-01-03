package kr.geomex.arrayTest;

public class ListforArray {
	int size =5;
	String[] array=new String[size];//한번 선언된 배열의 길이는 바꿀수 없다
	
	public void printAll() {
		for(int i=0;i<size;i++ ) {
			
			System.out.println(array[i]);
			
		}
	}
	
	public void print(int index) {
		
			System.out.println(array[index]);
			
	}
	
	public boolean delete(int index) {
		System.out.println("삭제하기전 공간의 값은 : "+array[index]);
		if(index<size) {
		array[index]=null;
		System.out.println("삭제 후 해당공간의 값은 : "+array[index]);
		}else{
			
			System.out.println("배열의 길이를 초과한 값을 입력하였습니다");
		}
		return true;
	}
	
	public boolean insert(int index,String str) {
			
		if(array[index]==null) {// 배열안에 값이있는지를 체크하기위한  if문
			

			if(index<size) {//배열의 크기에 맟춰 값을 넣는 if문
				
				array[index]=str;
				
				System.out.println("새로운값 :"+array[index]);
				
			}else {
				
				System.out.println("배열의 길이를 초과한 값을 입력하였습니다");
				
			}
			
			}else {//만약 값이 있을때
				
				for(int i=size-1;i>=index;--i) {//배열의 길이 부터 선택한 배열의 인덱스까지 반복
					
					
					array[i]= array[i-1];//한칸씩 인덱스가  뒤로밀린다
					
					if(i==index) {
						
						array[index]=str;//바꿀 데이터를 넣어준다
					}
					
				}
				System.out.println("중복값체크 : "+array[index]);
			}
			return true;
		}
	
}
