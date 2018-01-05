package kr.geomex.abstractTest;

public abstract class Shape implements ComputerArea {

	abstract void draw();
	
	abstract void calculate(int a, int b) throws Exception;
	
	@Override
	public void show(int x,int y) {
		System.out.print("가로"+x+"높이"+y);
		
	}
}
