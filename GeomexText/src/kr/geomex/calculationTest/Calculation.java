package kr.geomex.calculationTest;

public class Calculation {

	public void print() {
		int a = 5, b = 6;
		int sum = a + b;// 덧셈
		System.out.println("a+b=" + sum);
		int sub = a - b;
		System.out.println("a-b=" + sub);
		int mul = a * b;
		System.out.println("a*b=" + mul);
		int div = a / b;
		System.out.println("a/b=" + div);
		int mod = a % b;
		System.out.println("a%b=" + mod);
		int c = ++a;
	//	a = a+1;
	//	c = a;
		int d = a++;
		//d = a;
	//	a = a + 1;
		//int c = (a+1);
		System.out.println("a의전위연산(prefx)=" + c);// 단항연산자
		System.out.println(a);
		//int d = (a)+1;
		System.out.println("b후위연산(postfx)=" + b);// 단항 연산자 호출이 끝날때 1씩증가
		System.out.println(d);
	}

	public int sum(int a, int b) {

		int sum = a + b;

		return sum;
	}

	public int sub(int a, int b) {

		int sub = a - b;

		return sub;
	}

	public int mul(int a, int b) {

		int mul = a * b;

		return mul;
	}

	public int div(int a, int b) {

		int div = a / b;

		return div;
	}

	public int mod(int a, int b) {

		int mod = a % b;

		return mod;
	}

}
