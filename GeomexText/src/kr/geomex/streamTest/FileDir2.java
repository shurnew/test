package kr.geomex.streamTest;

import java.io.File;

public class FileDir2 {

	File f1 = new File("C:/log.txt");

	public void test() {

		System.out.println("���� �̸�: " + f1.getName());
		System.out.println("���� ���: " + f1.getPath());
		System.out.println("���� �̸�: " + f1.getAbsolutePath());
		System.out.println(f1.exists() ? "���� ����" : "���� ����");
		System.out.println(f1.canWrite() ? "��������" : "�����Ұ���");
		System.out.println(f1.isDirectory() ? "���丮" : "���丮�ƴ�");
		System.out.println(f1.isFile() ? "����" : "���Ͼƴ�");
		System.out.println(f1.isAbsolute() ? "������" : "�����");
		System.out.println(f1.lastModified());
		System.out.println("������ ũ��"+f1.length()+"Bytes");
		f1.renameTo(new File("C:/log1.txt"));
		
		
	}
}
