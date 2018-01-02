package kr.geomex.calculationTest;

public class LogicalOPTest {

	public  void print() {
		boolean a;
		a=(20>10)||(30>40);//두개의 관계식중 둘다 참이거나 하나가참일때 참이다
		System.out.println(a);
		a=(20>10)&&(30>40);//두개의 관계식중 둘다 참이어야 참
		System.out.println(a);
		a=!true;//참일때거짓이고 거짓일때참이된다
		System.out.println(a);
		
		System.out.println("둘중하나가참인가?"+((10<20)||(40<30)));//출력문에서 직접관계연산식을 사용할수있다
		System.out.println("두개다모두참인가?"+((10<20)&&(40<30)));
		System.out.println("true의!(not)은?"+(!true));
	}

}
