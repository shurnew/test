package kr.geomex.streamTest;

import java.io.File;

public class FileDir {

	String directory = "C:/Windows";
	File f1 = new File(directory);//��θ� ���� ��ü

	public void test() {

		if (f1.isDirectory()) {
			
			System.out.println("�˻� ���丮" + directory);

			String s[] = f1.list();

			for (int i = 0; i < s.length; i++) {
				File f = new File(directory + "/" + s[i]);
				if (f.isDirectory()) {
					System.out.println(s[i] + ":���丮");
				}else {
					System.out.println(s[i] + ":����");
				}
			}
		}else {
			System.out.println("������"+directory+"�� ���丮�� �ƴ�");
		}
		

	}
}
