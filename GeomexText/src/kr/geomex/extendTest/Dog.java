package kr.geomex.extendTest;

public class Dog extends Animal implements Action {

	@Override
	public void think() {

		System.out.println("ÁÖÀÎ°ú ³î°í½Í´Ù");
	}

	@Override
	public void eat() {
		System.out.println("»ç·á¸¦¸Ô´Â´Ù");

	}

	@Override
	public void talk() {

		System.out.println("¿Ð¿Ð¿Ð");
	}
}
