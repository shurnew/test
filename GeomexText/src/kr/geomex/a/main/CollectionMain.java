package kr.geomex.a.main;

import kr.geomex.collecttionTest.ArrayListTest;
import kr.geomex.collecttionTest.HashMapTest;
import kr.geomex.collecttionTest.HashSetTest;

public class CollectionMain {

	public static void main(String[] args) {
		
		/**
		 * 
		 * 
		 * ArrayList를 사용하기위한 프로그램
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
		 * HashSet을 사용하기 위한  프로그램  
		 */
		
		
		HashSetTest hs=new HashSetTest();
		
		hs.add("a", 3);
		hs.add("a", 2);
		hs.add("a", 1);
		hs.add("a", 3);//hashset은 중복을 허용하지않는다
		
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
		
		System.out.println("-부분집합-------------------------");
		hs.contains();//부분집합
		
		System.out.println("-합집합-------------------------");
		hs.addall(hs.set1, hs.set2);//합집합
		
		System.out.println("-교집합-------------------------");
		 
		hs.retain("a","b");

		System.out.println("-차집합-------------------------");
		 
		hs.remove(hs.set1, hs.set2);
		
		
		/**
		 * 
		 * 
		 * HashMap을 사용하는 프로그램
		 */
		
		/*HashMapTest hm=new HashMapTest();
		hm.put("201585013","송재림");
		hm.put("201300014","이우석");
		hm.put("201485014","신선호");
		hm.put("201200014","신재식");
		hm.print();
		System.out.println(hm.get("201685013"));*/
		
	}

}
