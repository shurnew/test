package kr.geomex.loginSystem;

import java.util.HashMap;

public class User {
	String gender = "";
	String name = "";
	int score = 0;

	public User() {

	}

	public User(String name, String gender) {

		this.name = name;
		this.gender = gender;
	}
	
	public User(String name, int score, String gender) {

		this.name = name;
		this.score = score;
		this.gender = gender;
	}

	@Override
	public String toString() {
		
		return "[이름 :"+name+" 성별 :"+gender+"]";
	}
}
