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
		System.out.println("-----------�޸��� ����------------");

		while (loop) {
			start();
			selectMenu(sc.nextInt());

		}

	}

	public void start() {
		System.out.println("-------------�޴�--------------");
		System.out.println("1.�޸��߰�");
		System.out.println("2.���û���");
		System.out.println("3.�޸����");
		System.out.println("4.��ü����");
		System.out.println("5.���ú���");
		System.out.println("6.��ü����");
		System.out.println("0.���α׷�����");
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

				System.out.println("�ҷ����� ����:�߸��� �ε����� ȣ���Ͽ����ϴ�");
			}

			break;
		case 3:

			System.out.println("�ε��� ���� �Է����ּ���");

			a = sc.nextInt();
			set(a, sc.next());
			break;
		case 4:

			printAll();
			break;

		case 5:

			System.out.println("�ε��� ���� �Է����ּ���");

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
