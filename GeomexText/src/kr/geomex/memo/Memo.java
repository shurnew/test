package kr.geomex.memo;

import java.util.ArrayList;
import java.util.Iterator;

import org.omg.CORBA.ExceptionList;

import kr.geomex.exceptionTest.ArrayException;

public class Memo extends Time implements ListEdit {

	String message = "";
	
	public ArrayList<Table> list = new ArrayList<>();

	@Override
	public void add(String s) {

		String time = getTime();
		
		list.add(new Table(s, time));
		System.out.println("저장 완료!");
	}

	@Override
	public void delete(int i) throws Exception {
		try {

			if (list.size() != 0) {

				if (i >= 0) {
					list.remove(i);

				} else {

					throw new Exception();
				}
			} else {

				throw new MemoException();
			}

		} catch (MemoException e) {

			System.out.println(e.getMessage());
		} catch (Exception e1) {

			System.out.println("삭제하기 실패:잘못된 인덱스를 호출하였습니다");
		}
	}

	@Override
	public void printAll() {

		Iterator<Table> ai = list.iterator();

		System.out.println("-----------저장된 메모----------");
		System.out.println(list.size() + "개 메모가 저장되어있습니다");

		while (ai.hasNext()) {
			System.out.println(ai.next());
		}

		System.out.println("-----------------------------");
	}

	@Override
	public String get(int i) {

		String str = "";
		try {
			if (list.size() != 0) {

				if (i >= 0) {

					str = (list.get(i)).toString();
				} else {
					throw new Exception();

				}
			} else {

				throw new MemoException();
			}
		} catch (MemoException e) {

			System.out.println(e.getMessage());

		} catch (Exception e1) {

			System.out.println("불러오기 실패:잘못된 인덱스를 호출하였습니다");
		}

		return str;
	}

	@Override
	public void print(int i) {
		System.out.println("----선택한 메모를 불러왔습니다----");
		System.out.println(get(i));
		System.out.println("-------------------------");

	}

	@Override
	public void clear() {

		list.clear();
	}

}
