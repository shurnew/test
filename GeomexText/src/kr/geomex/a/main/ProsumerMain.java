package kr.geomex.a.main;

import kr.geomex.ThreadTest.Buffer;
import kr.geomex.ThreadTest.Consumer;
import kr.geomex.ThreadTest.Producer;

public class ProsumerMain {

	public static void main(String[] args) {
	
		Buffer buf= new Buffer();
		Producer p =new Producer(buf);
		Consumer c =new Consumer(buf);
		
		p.start();
		c.start();
	}

}
