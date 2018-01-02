package kr.geomex.collecttionTest;

public class Student {
	String num="";
	String name="";
	
	public  Student(String num,String name) {
		 this.name=name;
		 this.num=num;
	 }
	
	@Override
	
	public String toString() {
		
		return "Student [num=" + num + ", name=" + name + "]";
	}		
	 				
}
