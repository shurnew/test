package kr.geomex.a.main;

import kr.geomex.objectConvert.Computer;
import kr.geomex.objectConvert.Mouse;
import kr.geomex.objectConvert.Notebook;

public class ComputerMain {

	public static void main(String[] args) {
		
		Computer c1=new Mouse();
		Notebook c2=new Notebook();
		Mouse c3=new Mouse();
		
		c1.on();//하위 클래스에서 오버라이된 메소드 를 출력
	//	c1.click();
		c2.on();
		c2.click();
		c3.click();
	}

}
