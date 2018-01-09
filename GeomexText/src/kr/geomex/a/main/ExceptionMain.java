package kr.geomex.a.main;

import kr.geomex.exceptionTest.Name;
import kr.geomex.exceptionTest.NameException;
import kr.geomex.exceptionTest.Student;
import kr.geomex.exceptionTest.StudentAgeException;

public class ExceptionMain {
	
	public static void main(String[] args) {
		
		/*Student student = new Student(-1);
		
		try {
			
			student.print();
			
		} catch (StudentAgeException e) {
			
			System.out.println(e.getMessage());
		}*/
		
		
		Name n=new Name();
		try {
		n.write("");
		}catch (NameException e) {
			e.getMessage();
		}catch (Exception e) {
			System.out.println("비정상적인 동작");
		}
	}
}
