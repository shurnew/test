package kr.geomex.objectConvert;

public class Notebook extends Computer{
	
	@Override
	public void on() {
		System.out.println("노트북을 열고 전원버튼을 누른다");
	}
	public void click() {
		System.out.println("트랙패드로 클릭");
	}
}
