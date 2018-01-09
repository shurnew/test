package kr.geomex.loginSystem;

import java.util.HashMap;

public class SignUp extends User implements InsertData {

	HashMap<Integer, User> map = new HashMap<Integer, User>();// ȸ�������� ���� �����͸� ���� ���� ��

	@Override
	public void sign(int key, String name, String gender) {

		if (chack(key)) {
			map.put(key, new User(name, gender));
		} else {
			System.out.println("�ߺ�üũ����");
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

			System.out.println("�ߺ��� ��ȣ�� �����մϴ�");
		}
		return a;
	}
}
