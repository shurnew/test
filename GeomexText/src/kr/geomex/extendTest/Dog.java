package kr.geomex.extendTest;

public class Dog extends Animal implements Action {

	@Override
	public void think() {

		System.out.println("���ΰ� ���ʹ�");
	}

	@Override
	public void eat() {
		System.out.println("��Ḧ�Դ´�");

	}

	@Override
	public void talk() {

		System.out.println("�пп�");
	}
}
