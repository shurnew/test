package kr.geomex.loginSystem;

import java.util.HashMap;

public class Login extends SignUp implements GetData {

	LogView sc = new LogView();

	@Override
	public void get(int key) {

		try {

			if (map.get(key) != null) {
				
				sc.set(key, map.get(key));

			} else {

				throw new Exception();
			}
		} catch (Exception e) {

			System.out.println("잘못된 아이디입력");
		}
	}
}
