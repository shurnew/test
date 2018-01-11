package kr.geomex.streamTest;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjReadTest {

	public void read()throws Exception {
		ObjectInputStream ois= new ObjectInputStream(new FileInputStream("C:/Box.txt"));
		
		String s=(String)ois.readObject();
		Box b= (Box)ois.readObject();
		System.out.println(s);
		System.out.println(b);
		System.out.println(b.w);
		System.out.println(b.h);
		System.out.println(b.d);
		
	}
}
