package kr.geomex.student;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class StudentMain {
	
	/*Map<String,Student> studentMap = new HashMap<String,Student>();*/
	/*HashMap<String,Student> has = new HashMap<String,Student>();*/
	Map<String,Student> studentMap = new TreeMap<String,Student>();
	
	public void studentAdd() {
		
		studentMap.put("201485024", new Student(24,"leesj"));
	}
	
	public void studentGet() {
		
		Student stu = studentMap.get("201485024");
		System.out.println(stu.toString());
	}
	
	public static void main(String args[]) {
						
		StudentMain studentMain = new StudentMain();
		
		studentMain.studentAdd();
		
		studentMain.studentGet();
	}
}
