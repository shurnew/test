package kr.geomex.streamTest;

import java.io.File;

public class FileDir {

	String directory = "C:/Windows";
	File f1 = new File(directory);//경로만 가진 객체

	public void test() {

		if (f1.isDirectory()) {
			
			System.out.println("검색 디렉토리" + directory);

			String s[] = f1.list();

			for (int i = 0; i < s.length; i++) {
				File f = new File(directory + "/" + s[i]);
				if (f.isDirectory()) {
					System.out.println(s[i] + ":디렉토리");
				}else {
					System.out.println(s[i] + ":파일");
				}
			}
		}else {
			System.out.println("지정한"+directory+"는 디렉토리가 아님");
		}
		

	}
}
