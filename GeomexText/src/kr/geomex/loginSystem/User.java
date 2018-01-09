package kr.geomex.loginSystem;

import java.util.HashMap;

public class User {
	String gender = "";
	String name = "";
	String log = "";

	public User() {

	}

	public User(String name, String gender) {

		this.name = name;
		this.gender = gender;
	}

	public User(User a, String log) {
		this.name = a.name;
		this.gender = a.gender;
		this.log = log;
	}

	@Override
	public String toString() {

		return "[이름 :" + name + " 성별 :" + gender + "] " + log;
	}
}
