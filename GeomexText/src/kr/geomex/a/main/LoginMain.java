package kr.geomex.a.main;

import kr.geomex.loginSystem.Login;

public class LoginMain {

	public static void main(String[] args)throws Exception {
	
		Login li= new Login();
		
		
		li.sign(1, "신선호", "남자");
		li.sign(2, "남지현", "남자");
		li.sign(3, "오성혜", "여자");
		System.out.println("--------------------------------------------");
		li.logIn(1);
		li.logIn(2);
		li.logIn(3);
		li.logOut(1);
		li.logIn(1);

	}

}
