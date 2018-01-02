package kr.geomex.student;

public class Student {
	
	public int num = 0;
	public String name = "";
	
	public Student(int num, String name) {
		/*super();*/
		this.num = num;
		this.name = name;
	}

	@Override
	public String toString() {
		
		return "Student [num=" + num + ", name=" + name + "]";
	}		
}
