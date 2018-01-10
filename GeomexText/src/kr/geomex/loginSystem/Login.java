package kr.geomex.loginSystem;

import java.util.HashMap;

public class Login extends SignUp implements GetData {

	LogView lv = new LogView();

	@Override
	public void logIn(int key) {

		try {

			if (map.get(key) != null) {
				
				lv.set(key, map.get(key));

			} else {

				throw new Exception();
			}
		} catch (Exception e) {

			System.out.println("잘못된 아이디입력");
		}
	}
	
	public void logOut(int key)throws Exception {
		
		lv.delete(key,map.get(key));
		
	}
}
