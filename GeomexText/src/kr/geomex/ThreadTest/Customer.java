package kr.geomex.ThreadTest;

public class Customer extends Thread {
	Account same_a =new Account();
	public Customer(Account a,String s) {
		same_a=a;
		setName(s);
	}
	
	
	@Override
	public void run() {
	
		for (int i = 0; i < 200; i++) {
			System.out.println(getName()+":"+i+"¹øÂ°");
			same_a.deposit();
			
			if (same_a.gettotal()>=500000) {
				
				break;
			}
			
		}
	}
}
