package kr.geomex.a.main;

import kr.geomex.loginSystem.Login;

public class LoginMain {

	public static void main(String[] args)throws Exception {
	
		Login li= new Login();
		
		
		li.sign(1, "�ż�ȣ", "����");
		li.sign(2, "������", "����");
		li.sign(3, "������", "����");
		System.out.println("--------------------------------------------");
		li.logIn(1);
		li.logIn(2);
		li.logIn(3);
		li.logOut(1);
		li.logIn(1);

	}

}
