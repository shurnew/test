package kr.geomex.a.main;

import kr.geomex.collecttionTest.ArrayListTest;
import kr.geomex.collecttionTest.HashMapTest;
import kr.geomex.collecttionTest.HashSetTest;

public class CollectionMain {

	public static void main(String[] args) {
		
		/**
		 * 
		 * 
		 * ArrayList�� ����ϱ����� ���α׷�
		 */
		
			/*
			ArrayListTest list= new ArrayListTest(); 
			
			list.add("120");
			list.add("110");
			list.add("120");
			list.add("150");
			list.print();
			
			System.out.println("---------------------------------------");
			
			list.remove(2);
			list.print();
			
			System.out.println("---------------------------------------");
			
			String str= list.get(1);
			
			System.out.println(str);
			 */
		
		/**
		 * 
		 * 
		 * HashSet�� ����ϱ� ����  ���α׷�  
		 */
		
		
		HashSetTest hs=new HashSetTest();
		
		hs.add("a", 3);
		hs.add("a", 2);
		hs.add("a", 1);
		hs.add("a", 3);//hashset�� �ߺ��� ��������ʴ´�
		
		hs.add("b", 3);
		hs.add("b", 4);
		hs.add("b", 5);
		

		hs.add("c", 1);
		hs.add("c", 2);
		
		
		hs.print("a");
		System.out.println("--------------------------");
		hs.print("b");
		System.out.println("--------------------------");
		hs.print("c");
		
		System.out.println("-�κ�����-------------------------");
		hs.contains();//�κ�����
		
		System.out.println("-������-------------------------");
		hs.addall(hs.set1, hs.set2);//������
		
		System.out.println("-������-------------------------");
		 
		hs.retain("a","b");

		System.out.println("-������-------------------------");
		 
		hs.remove(hs.set1, hs.set2);
		
		
		/**
		 * 
		 * 
		 * HashMap�� ����ϴ� ���α׷�
		 */
		
		/*HashMapTest hm=new HashMapTest();
		hm.put("201585013","���縲");
		hm.put("201300014","�̿켮");
		hm.put("201485014","�ż�ȣ");
		hm.put("201200014","�����");
		hm.print();
		System.out.println(hm.get("201685013"));*/
		
	}

}
