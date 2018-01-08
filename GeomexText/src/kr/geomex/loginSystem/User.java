package kr.geomex.loginSystem;

public class User {

	String name = "";
	int num = 0;
	int score = 0;

	public User(int num, String name) {

		this.name = name;
		this.num = num;
	}

	public User(String name,int score) {
		
		this.name=name;
		this.score=score;
	}
}
