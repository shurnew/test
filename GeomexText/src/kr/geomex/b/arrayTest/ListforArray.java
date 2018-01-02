package kr.geomex.b.arrayTest;

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
			
		if(array[index]==null) {
			

			if(index<size) {
				
				array[index]=str;
				
				System.out.println("새로운값 :"+array[index]);
				
			}else {
				System.out.println("배열의 길이를 초과한 값을 입력하였습니다");
			}
			
			}else {
				
				for(int i=size-1;i>=index;--i) {
					
					
					array[i]= array[i-1];
					
					if(i==index) {
						
						array[index]=str;
					}
					
				}
				System.out.println("중복값체크 : "+array[index]);
			}
			return true;
		}
	
}
