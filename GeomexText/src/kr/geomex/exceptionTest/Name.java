package kr.geomex.exceptionTest;

public class Name  {

	public void write(String s) throws Exception {
		
		System.out.println(s);
		throw new NameException();
	}
}
