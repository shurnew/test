package kr.geomex.a.main;

import kr.geomex.memo.MemoException;
import kr.geomex.memo.MemoWrite;
import kr.geomex.memo.ListEdit;
import kr.geomex.memo.Memo;

public class MemoMain {

	public static void main(String[] args) {

		ListEdit di = new Memo();
		
		Memo memo = new Memo();//�ʱ�ȭ
		MemoWrite mesc = new MemoWrite();
	
		mesc.run();
		
		
		/*
		System.out.println("-----------�޸��� ����------------");

		try {

			memo.delete(0);
			
		} catch (MemoException e) {
			
			System.out.println(e.getMessage());
			
		} catch (Exception e1) {
			
			System.out.println("�ҷ����� ����:�߸��� �ε����� ȣ���Ͽ����ϴ�");
		}
		memo.add("���ܸ� �׽�Ʈ ���� �޸� ");
		memo.get(8);
		memo.clear();

		memo.add("���õ� ��ſ��Ϸ�");
		memo.add("���ϵ� ��ſ��Ϸ�");
		memo.add("����ó�� ���� �����ϱ�");
		memo.printAll();
		memo.print(2);
*/
	}
		

}
