package kr.geomex.streamTest;

import java.io.FileInputStream;

public class FisTest {

	public void read()throws Exception {
		FileInputStream fis =new FileInputStream("C:/out.txt");
		int i;
		while ((i=fis.read())!=-1) {
			
			System.out.println(i);
		}
		fis.close();
		System.out.println("���������Ϸκ��� �����͸� �޾� �Է�");
	}
}
