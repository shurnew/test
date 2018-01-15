package kr.geomex.a.main;

import kr.geomex.streamTest.CompanyDB;
import kr.geomex.streamTest.Customer;

public class CustomerMain {

	

	public static void main(String[] args) {
		
		CompanyDB db;
		
		try {
			db=new CompanyDB("C:/customer.txt");
			db.setDataBase(new Customer("신선호",25,"010-5523-6565"));
			db.setDataBase(new Customer("신선니",21,"010-5423-6565"));
			System.out.println(db.getDataBase(6));
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		

	}

}
