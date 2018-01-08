package kr.geomex.a.main;

import kr.geomex.memo.MemoException;
import kr.geomex.memo.MemoWrite;
import kr.geomex.memo.ListEdit;
import kr.geomex.memo.Memo;

public class MemoMain {

	public static void main(String[] args) {

		ListEdit di = new Memo();
		
		Memo memo = new Memo();//초기화
		MemoWrite mesc = new MemoWrite();
	
		mesc.run();
		
		
		/*
		System.out.println("-----------메모장 시작------------");

		try {

			memo.delete(0);
			
		} catch (MemoException e) {
			
			System.out.println(e.getMessage());
			
		} catch (Exception e1) {
			
			System.out.println("불러오기 실패:잘못된 인덱스를 호출하였습니다");
		}
		memo.add("예외를 테스트 위한 메모 ");
		memo.get(8);
		memo.clear();

		memo.add("오늘도 즐거운하루");
		memo.add("내일도 즐거운하루");
		memo.add("예외처리 까지 공부하기");
		memo.printAll();
		memo.print(2);
*/
	}
		

}
