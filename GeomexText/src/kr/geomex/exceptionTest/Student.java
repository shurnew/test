package kr.geomex.exceptionTest;

public class Student {
	
	public int age = 0;

	public Student(int age) {
		
		this.age = age;
	
	}
	public void print() throws StudentAgeException {
		
		if (age < 0) {
			
			throw new StudentAgeException();
			
		}
		
		System.out.println("�л� ���� : " + age);
	}
}
