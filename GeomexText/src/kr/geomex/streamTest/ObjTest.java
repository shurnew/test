package kr.geomex.streamTest;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjTest {

	Box b= new Box(10, "50", 40);
	
	public void write()throws Exception {
		ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("C:/Box.txt"));
		
		String s="æ»≥Á«œººø‰";
				
		System.out.println("getString : " + b.getString());
		oos.writeObject(s);
		oos.writeObject(b);
		
		oos.close();
	}
}
