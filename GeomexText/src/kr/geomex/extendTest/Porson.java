package kr.geomex.extendTest;

public class Porson extends Animal implements Action{
	
	@Override
	public void think() {
	
		System.out.println("���� ��Ʈ���� �常�ϰ�ʹ�");
	}

	@Override
	public void eat() {
		
		System.out.println("���� �Դ´�");
	}

	@Override
	public void talk() {
		
		System.out.println("�ȳ��ϼ���");
	}
}
