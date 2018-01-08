package kr.geomex.interfaceTest;

public class Polis {
	PolisGun p =null;
	
	public Polis(PolisGun p) {
		
		this.p=p;
		
		p.shot();
	}
}
