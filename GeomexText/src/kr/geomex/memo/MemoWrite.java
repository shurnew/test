package kr.geomex.memo;

import java.util.Scanner;

public class MemoWrite extends Memo {

	Scanner sc = new Scanner(System.in);
	boolean loop = true;

	public void set(int i, String s) {

		String time = getTime();

		list.set(i, new Table(s, time));
	}

	public void run() {
		System.out.println("-----------메모장 시작------------");

		while (loop) {
			start();
			selectMenu(sc.nextInt());

		}

	}

	public void start() {
		System.out.println("-------------메뉴--------------");
		System.out.println("1.메모추가");
		System.out.println("2.선택삭제");
		System.out.println("3.메모수정");
		System.out.println("4.전체보기");
		System.out.println("5.선택보기");
		System.out.println("6.전체삭제");
		System.out.println("0.프로그램종료");
		System.out.println("------------------------------");
	}

	public boolean selectMenu(int i) {

		int a = 0;

		switch (i) {
		case 1:

			add(sc.next());
			break;

		case 2:

			try {
				a = sc.nextInt();
				delete(a);

			} catch (MemoException e) {

				System.out.println(e.getMessage());

			} catch (Exception e1) {

				System.out.println("불러오기 실패:잘못된 인덱스를 호출하였습니다");
			}

			break;
		case 3:

			System.out.println("인덱스 값을 입력해주세요");

			a = sc.nextInt();
			set(a, sc.next());
			break;
		case 4:

			printAll();
			break;

		case 5:

			System.out.println("인덱스 값을 입력해주세요");

			a = sc.nextInt();
			print(a);
			break;
		case 6:

			clear();
			break;
		case 0:

			loop = false;
			break;

		}
		return loop;
	}

}
