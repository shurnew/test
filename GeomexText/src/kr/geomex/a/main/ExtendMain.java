package kr.geomex.a.main;


import kr.geomex.extendTest.ScorePrinter;
import kr.geomex.extendTest.Students;

public class ExtendMain {

 static void main(String[] args) {
		
		ScorePrinter ex=new ScorePrinter();
		
		ex.add("������",70);
		ex.add("�ǹ���",12);
		ex.add("������",99); 
		ex.add("������",63);
		ex.add("�輺��",80); 
		ex.add("���ȯ",75);
		//ex.test();
		//ex.superPrint();
		System.out.println("-------------------------------------");
		ex.print();//��ӹ��� ExtendTest1�� print�޼ҵ尡����ȴ�
	}

}
