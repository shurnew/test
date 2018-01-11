package kr.geomex.streamTest;

import java.io.File;
import java.io.FileOutputStream;

public class FosTest  {
	
	public void write()throws Exception {
	
		FileOutputStream fos =new FileOutputStream("C:/out.txt");
		
		for (int i = 1; i <=5; i++) {
			
			fos.write(i);
		}
		fos.close();
		System.out.println("지정한파일명으로 ByteStreamFile생성");
	}
	
	
}
