package kr.geomex.exceptionTest;

public class StudentAgeException extends Exception {

	public StudentAgeException() {
		
		super("유효하지 않은 나이 초기화");
	}
}
