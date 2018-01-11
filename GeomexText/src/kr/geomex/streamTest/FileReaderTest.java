package kr.geomex.streamTest;

import java.io.FileReader;

public class FileReaderTest extends FileWriterTest  {

	
	
	public void read()throws Exception {
		
		FileReader fr =new FileReader(address);
		int i;
		
		while ((i= fr.read())!=-1) {
			System.out.print((char)i);
			
		}
		fr.close();
	}
	
}
