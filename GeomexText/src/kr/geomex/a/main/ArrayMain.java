package kr.geomex.a.main;

import kr.geomex.arrayTest.DeleteArray;
import kr.geomex.arrayTest.InsertArray;
import kr.geomex.arrayTest.ListforArray;

public class ArrayMain {

	public static void main(String[] args) {
		
		/**
		 * �迭�� ���� �߰��غ��� ���α׷�
		 */
		
/*
		InsertArray array = new InsertArray();
		
		array.insert("��");
		
		array.insert("��");
		
		array.insert("ȣ");
		
		array.insert("��ȣ");
		
		array.insert("�ż�ȣ");
		
		System.out.println("���ϴ� �迭���� ����?");
		
		array.print(4);
*/
		
		/**
		 * �迭�� ���� �߰��ϰ�  ������ ���� �ε����� ���� �߰��غ��� ���α׷�
		 */
		

		DeleteArray ary=new DeleteArray();
		
		System.out.println("�迭�ȿ�����Ȱ�----------------");
		
		ary.printAll();
		
		System.out.println("--------------------------");
		
		ary.delete(1);
		
		ary.insert(1, "���� �Է��� ��_01");
		
		ary.insert(1, "���� �Է��� ��_02");
		
		ary.print(1);
		
		ary.print(2);//�迭��  1���ڸ��� �����͸� �߰��ϸ� 1���ڸ����ִ� �����͸� ����� 1�������͸� �������
		
		
		/**
		 * �迭���� ����Ʈó�� �ߺ��� �ε�����  �����͸� ������ʰ� �����ε����� ��ĭ�� �о�� ���α׷� 
		 */
		
/*		
		ListforArray ary= new ListforArray();
		
		ary.insert(0,"0��");
		
		ary.insert(1,"���� 1��");
		
		ary.insert(2,"2��");
		
		ary.insert(3,"3��");
		
		ary.insert(4,"4��");
		
		ary.insert(1,"���ο�1��");
		
		System.out.println(ary.insert(2,"���ο�2��"));//print�� �޼ҵ带 ȣ���ϸ� �޼ҵ���� ����� ���డ��
		
		System.out.println("-------------------------");
		
		ary.printAll();
*/		
		
		
		
		
	}

}
