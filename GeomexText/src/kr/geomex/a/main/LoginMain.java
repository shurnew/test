package kr.geomex.a.main;

import kr.geomex.loginSystem.Login;

public class LoginMain {

	public static void main(String[] args) {
	
		Login si= new Login();
		
		
		si.sign(1, "�ż�ȣ", "����");
		si.sign(2, "������", "����");
		si.sign(3, "������", "����");
		System.out.println("--------------------------------------------");
		si.get(1);
		si.get(2);
		si.get(3);
		si.get(1);

	}

}
