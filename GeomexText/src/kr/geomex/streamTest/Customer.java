package kr.geomex.streamTest;

public class Customer {
	String name;
	int age;
	String tele;
	
	public Customer() {
		this(null,0,null);
	}
	
	public Customer(String name,int age, String tele) {
	
		this.name=name;
		this.age=age;
		this.tele=tele;
	}
	
	public String getName() {
		return name;
	}
	
	public String getTele() {
		return tele;
	}
	
	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
	
		return "�� [ �̸� :"+name+" ����:"+age+" ��ȭ��ȣ :"+tele+"]";
	}
	
	
}
