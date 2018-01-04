package kr.geomex.extendTest;

public class Students {

	int grade =0;
	String name="";
	
	public Students(String name, int grade) {
	
		this.name=name;
		this.grade=grade;
	}
	
	@Override
	public String toString() {
		
		
		return  "Student [name=" +name + ", Score=" + grade + "]";
	}
}
