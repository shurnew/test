package kr.geomex.petTest;

public class Pet5 {
	public final int MEX_AGE=10;
	public int age = 1;
	public String name = "�̸��� �������ּ���";
	public double weight =00.00;
	
	
	
	public  void setData(String name,int age,double w) {
		if(age<=0||w<0) {
			System.out.println("���� �Ǵ� �����Դ� 0���������������ϴ�");
			return;
		}else if(age>MEX_AGE) {
			System.out.println("���̴� 10���� Ŭ�������ϴ�");
			return;
		}
		this.name=name;
		this.age=age;
		this.weight=w;
	}

}
