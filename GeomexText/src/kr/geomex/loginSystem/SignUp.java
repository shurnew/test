package kr.geomex.loginSystem;

import java.util.HashMap;

public class SignUp extends User implements InsertData {

	HashMap<Integer, User> map = new HashMap<Integer, User>();// 회원가입을 위한 데이터를 담을 유저 맵

	@Override
	public void sign(int key, String name, String gender) {

		if (chack(key)) {
			map.put(key, new User(name, gender));
		} else {
			System.out.println("중복체크오류");
		}

	}

	@Override
	public Boolean chack(int key) {

		boolean a = true;

		try {

			if (map.get(key) != null) {
				a=false;
				throw new Exception();
			}
		} catch (Exception e) {

			System.out.println("중복된 번호가 존재합니다");
		}
		return a;
	}
}
