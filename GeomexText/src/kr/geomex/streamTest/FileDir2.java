package kr.geomex.streamTest;

import java.io.File;

public class FileDir2 {

	File f1 = new File("C:/log.txt");

	public void test() {

		System.out.println("파일 이름: " + f1.getName());
		System.out.println("파일 경로: " + f1.getPath());
		System.out.println("파일 이름: " + f1.getAbsolutePath());
		System.out.println(f1.exists() ? "파일 존재" : "파일 없음");
		System.out.println(f1.canWrite() ? "수정가능" : "수정불가능");
		System.out.println(f1.isDirectory() ? "디랙토리" : "디렉토리아님");
		System.out.println(f1.isFile() ? "파일" : "파일아님");
		System.out.println(f1.isAbsolute() ? "절대경로" : "상대경로");
		System.out.println(f1.lastModified());
		System.out.println("파일의 크기"+f1.length()+"Bytes");
		f1.renameTo(new File("C:/log1.txt"));
		
		
	}
}
