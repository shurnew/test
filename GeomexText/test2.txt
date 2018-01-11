package kr.geomex.streamTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileStream {
	
	 long startTime = System.currentTimeMillis();    
	 
	FileInputStream fi =null;
	FileOutputStream fo= null;
	int readData =-1;
	
	public void test()throws Exception {
		
	fi= new FileInputStream("src/kr/geomex/streamTest/FileStream.java");
	fo=new FileOutputStream("test2.txt");
	while((readData=fi.read())!=-1) {
		fo.write(readData);
		
	}
	fo.flush();
	fo.close();
	fi.close();
	

	 long endTime = System.currentTimeMillis();
	    
     System.out.println(endTime-startTime); 
	}

}
