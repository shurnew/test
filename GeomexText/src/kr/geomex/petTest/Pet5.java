package kr.geomex.petTest;

public class Pet5 {
	public final int MEX_AGE=10;
	public int age = 1;
	public String name = "이름을 설정해주세요";
	public double weight =00.00;
	
	
	
	public  void setData(String name,int age,double w) {
		if(age<=0||w<0) {
			System.out.println("나이 또는 몸무게는 0보다작을수없습니다");
			return;
		}else if(age>MEX_AGE) {
			System.out.println("나이는 10보다 클수없습니다");
			return;
		}
		this.name=name;
		this.age=age;
		this.weight=w;
	}

}
