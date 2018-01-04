package kr.geomex.abstractTest;

public class Triangle extends Shape {

	@Override
	public void calculate(int a, int b) {
		System.out.println("»ï°¢ÇüÀÇ ³ĞÀÌ"+(a*b/2));
		
	}
	
	@Override
	public void draw() {
		
		System.out.println("»ï°¢ÇüÀ» ±×·È½À´Ï´Ù");
	}
}
