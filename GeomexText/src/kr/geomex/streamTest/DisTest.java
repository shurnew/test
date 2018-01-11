package kr.geomex.streamTest;

import java.io.DataInputStream;

import java.io.FileInputStream;

public class DisTest extends DosTest  {

	public void read() throws Exception {
		
		FileInputStream fis =new FileInputStream(s);
		DataInputStream dis = new DataInputStream(fis);
		
		System.out.println(dis.readBoolean());
		System.out.println(dis.readByte());
		System.out.println(dis.readChar());
		System.out.println(dis.readDouble());
		System.out.println(dis.readFloat());
		System.out.println(dis.readInt());
		System.out.println(dis.readLong());
		System.out.println(dis.readShort());
		fis.close();
		
	}
}
