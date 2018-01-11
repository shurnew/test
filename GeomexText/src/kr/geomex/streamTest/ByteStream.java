package kr.geomex.streamTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteStream {
	
	 long startTime = System.currentTimeMillis();    
	
	FileInputStream fi =null;
	FileOutputStream fo= null;
	int readCount =-1;
	byte[] buffer =new byte[512];
	
	public void test()throws Exception {
		
	fi= new FileInputStream("src/kr/geomex/streamTest/ByteStream.java");
	fo=new FileOutputStream("test.txt");
	while((readCount=fi.read(buffer))!=-1) {
		fo.write(buffer,0,readCount);
		
	}

	fo.close();
	fi.close();
	 long endTime = System.currentTimeMillis();
    
     System.out.println(endTime-startTime); 
	
	}
	
	
}
