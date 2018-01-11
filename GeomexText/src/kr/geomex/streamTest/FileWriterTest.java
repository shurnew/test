package kr.geomex.streamTest;

import java.io.File;
import java.io.FileWriter;

public class FileWriterTest {
	String source= "";
	String address= "C:/w.txt";
	
	
	public void write(String s)throws Exception {
		
		this.source=s;
		char input[] =new char[source.length()];
		
		source.getChars(0, source.length(), input, 0);
		FileWriter fw =new FileWriter(address);
		fw.write(input);
		fw.close();
	}
}
