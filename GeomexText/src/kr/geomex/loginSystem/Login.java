package kr.geomex.loginSystem;

import java.util.HashMap;

public class Login extends Register implements GetData {

	@Override
	public void get(int key) {

		try {

			if (map.get(key) != null) {
				
				System.out.println(map.get(key));
				
				
			} else {
				
				throw new Exception();
			}
		} catch (Exception e) {

			System.out.println("잘못된 아이디입력");
		}
	}
}
