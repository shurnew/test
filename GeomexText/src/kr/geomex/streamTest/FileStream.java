package kr.geomex.streamTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStream {

	long startTime = System.currentTimeMillis();

	FileInputStream fi = null;
	FileOutputStream fo = null;
	int readData = -1;

	public void test() {

		try {
			fi = new FileInputStream("src/kr/geomex/streamTest/FileStream.java");
			fo = new FileOutputStream("test2.txt");

			while ((readData = fi.read()) != -1) {

				fo.write(readData);

			}
			fo.flush();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace(); 
		} catch (IOException e) {
			
			e.printStackTrace();
		} finally {

			try {
				fi.close();
			} catch (Exception e) {

			}
			try {
				fo.close();
			} catch (Exception e2) {

			}

		}

		long endTime = System.currentTimeMillis();

		System.out.println(endTime - startTime);
	}

}
