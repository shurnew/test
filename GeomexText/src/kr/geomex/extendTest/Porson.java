package kr.geomex.extendTest;

public class Porson extends Animal implements Action{
	
	@Override
	public void think() {
	
		System.out.println("새로 노트북을 장만하고싶다");
	}

	@Override
	public void eat() {
		
		System.out.println("밥을 먹는다");
	}

	@Override
	public void talk() {
		
		System.out.println("안녕하세요");
	}
}
