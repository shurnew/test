package kr.geomex.ThreadTest;

public class TVContribution  {

	public static void main(String[] args)throws Exception {
		Account acc=new Account();
		
		Customer don1 =new Customer(acc, "1번째성금자");
		Customer don2 =new Customer(acc, "2번째성금자");
		Customer don3 =new Customer(acc, "3번째성금자");
		Customer don4 =new Customer(acc, "4번째성금자");
		Customer don5 =new Customer(acc, "5번째성금자");
		
		don1.start();
		don2.start();
		don3.start();
		don4.start();
		don5.start();
		don1.join();
		don2.join();
		don3.join();
		don4.join();
		don5.join();
		
		System.out.println("성금 총액"+acc.gettotal());
	}

}
