package kr.geomex.b.arrayTest;

public class DeleteArray {
	int size = 4;
//	String[] array=new String[size];
	String []array= {"이 공간은 0번공간","이 공간은1번공간","이 공간은3번공간","이 공간은4번공간"};//선언할때 값을 먼저 넣어준다
	
	public DeleteArray(){

		
		/*
		array[0]="이 공간은 0번공간";
		array[1]="이 공간은1번공간";
		array[2]="이 공간은2번공간";
		array[3]="이 공간은3번공간";
		*/
	}
	
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
		
		if(index<size) {
			
			array[index]=str;
			System.out.println(index+"번 자리의 값이 변경되었습니다");
		}else{
			
			System.out.println("배열의 길이를 초과한 값을 입력하였습니다");
			
		}
		
		return true;
	}
	
}
