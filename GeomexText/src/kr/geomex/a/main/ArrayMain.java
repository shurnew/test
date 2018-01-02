package kr.geomex.a.main;

import kr.geomex.arrayTest.DeleteArray;
import kr.geomex.arrayTest.InsertArray;
import kr.geomex.arrayTest.ListforArray;

public class ArrayMain {

	public static void main(String[] args) {
		
		/**
		 * 배열에 값에 추가해보는 프로그램
		 */
		
/*
		InsertArray array = new InsertArray();
		
		array.insert("신");
		
		array.insert("선");
		
		array.insert("호");
		
		array.insert("선호");
		
		array.insert("신선호");
		
		System.out.println("원하는 배열안의 값은?");
		
		array.print(4);
*/
		
		/**
		 * 배열에 값을 추가하고  삭제와 같은 인덱스에 값을 추가해보는 프로그램
		 */
		

		DeleteArray ary=new DeleteArray();
		
		System.out.println("배열안에저장된값----------------");
		
		ary.printAll();
		
		System.out.println("--------------------------");
		
		ary.delete(1);
		
		ary.insert(1, "새로 입력한 값_01");
		
		ary.insert(1, "새로 입력한 값_02");
		
		ary.print(1);
		
		ary.print(2);//배열은  1번자리에 데이터를 추가하면 1번자리에있는 데이터만 덮어씌여 1번데이터만 사라진다
		
		
		/**
		 * 배열에서 리스트처럼 중복된 인덱스의  데이터를 덮어쓰지않고 다음인덱스로 한칸씩 밀어쓰는 프로그램 
		 */
		
/*		
		ListforArray ary= new ListforArray();
		
		ary.insert(0,"0번");
		
		ary.insert(1,"기존 1번");
		
		ary.insert(2,"2번");
		
		ary.insert(3,"3번");
		
		ary.insert(4,"4번");
		
		ary.insert(1,"새로운1번");
		
		System.out.println(ary.insert(2,"새로운2번"));//print로 메소드를 호출하면 메소드안의 기능을 수행가능
		
		System.out.println("-------------------------");
		
		ary.printAll();
*/		
		
		
		
		
	}

}
