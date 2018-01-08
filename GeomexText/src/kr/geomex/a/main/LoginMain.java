package kr.geomex.a.main;

import kr.geomex.loginSystem.Login;

public class LoginMain {

	public static void main(String[] args) {
	
		Login sign= new Login();
		
		
		sign.put(1, "신선호", "남자");
		
		sign.get(1);

	}

}
