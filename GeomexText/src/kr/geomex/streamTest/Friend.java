package kr.geomex.streamTest;

public class Friend {

	String name ="";
	int age=0;
	double weight=0;
	String telephone;
	
	public Friend() {
		this(null,0,0.0,null);
	}

	public Friend(String name, int age, double weight, String telephone) {
		super();
		this.name= name;
		this.age= age;
		this.weight= weight;
		this.telephone= telephone;
		
	}
	
	public void setName(String name) {
		this.name= name;
	}
	

	public void setTelephone(String telephone) {
		this.telephone= telephone;
	}
	
	public void setAge(int age) {
		this.age= age;
	}
	
	public void setWeight(int weight) {
		this.weight= weight;
	}
	
	public String getName() {
		return name;
	}
	
	public String getTelephone() {
		return telephone;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getWeight() {
		return weight;
	}
	
	@Override
	public String toString() {
	
		return "[name ="+name+", telephone ="+telephone+", age ="+age+", weght ="+weight+"]";
	}
	
	@Override
	public boolean equals(Object obj) {
		
		return toString().equals(obj.toString());
	}
}
