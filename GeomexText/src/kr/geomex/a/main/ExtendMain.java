package kr.geomex.a.main;


import kr.geomex.extendTest.ExtendTest1;
import kr.geomex.extendTest.Students;

public class ExtendMain {

	public static void main(String[] args) {
		
		ExtendTest1 ex=new ExtendTest1();
		
		ex.add("신지현",70);
		ex.add("권미진",12);
		ex.add("오성혜",99); 
		ex.add("배지용",63);
		ex.add("김성오",80); 
		ex.add("김승환",75);
		//ex.test();
		ex.superPrint();
		System.out.println("-------------------------------------");
		ex.print();//상속받은 ExtendTest1의 print메소드가실행된다
	}

}
