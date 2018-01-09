package kr.geomex.loginSystem;

import java.util.Collections;
import java.util.Map;

import java.util.Set;

public class LogView extends SignUp implements LogPrint {

	@Override
	public void print() {
		 
		Set<Map.Entry<Integer, User>> count = map.entrySet();
		
		for (Map.Entry<Integer, User> entry : count) {// 맵을 출력해주는 구문

			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

	@Override
	public void set(int key, User a) {


		map.put(key, new User(a, "접속중"));
		
		print();
	}

}
