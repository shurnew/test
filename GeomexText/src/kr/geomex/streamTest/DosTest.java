package kr.geomex.streamTest;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DosTest {
	
	String s= "C:/good.txt";
	
	public void write()throws Exception {
		FileOutputStream fos= new FileOutputStream(s);
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeBoolean(false);
		dos.writeByte(Byte.MAX_VALUE);
		dos.writeChars("½Å");
		dos.writeDouble(Double.MAX_VALUE);
		dos.writeFloat(Float.MIN_VALUE);
		dos.writeInt(Integer.MAX_VALUE);
		dos.writeLong(Long.MAX_VALUE);
		dos.writeShort(Short.MAX_VALUE);
		fos.close();
	}
}
