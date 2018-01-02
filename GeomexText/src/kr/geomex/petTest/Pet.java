package kr.geomex.petTest;

public class Pet {
	public final int MEX_AGE=10;//final은 상수를 표현 상수의 변수명은 대문자로한다 
	public int age = 1;//JAVA 에서 정수를 표현핳땐 대부분 INT형릏 쓴다
	public String name = "이름을 설정해주세요";
	public double weight =00.00;//실수를 표현할땐 주로 double형을 많이 사용한다0
	
	public Pet() {
	}//생성자는 반환값이 없고 클래스명과 같다
	 
	public void printData(){
		System.out.println("이름 "+name+" 나이 "+age+" 몸무게 "+weight);
	}
	public void setData(String name, int age, double w) {
		if(age<=0||w<0) {
			System.out.println("나이 또는 몸무게는 0보다작을수없습니다");
			return;
		}else if(age>MEX_AGE) {
			System.out.println("나이는 10보다 클수없습니다");
			return;
		}
		/**
		 * this의 의미는 메모리가 할당되었을때 자기자신을 믜미한다
		 */
		this.name=name;
		this.age=age;
		this.weight=w;
	} 
	
}
