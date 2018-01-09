package kr.geomex.a.main;

import kr.geomex.interfaceTest.Glock;
import kr.geomex.interfaceTest.M4Camo;
import kr.geomex.interfaceTest.Polis;
import kr.geomex.interfaceTest.PolisGun;

public class PolisMain {
	
	public static void main(String[] args) {
		PolisGun g1 = new M4Camo();
		PolisGun g2 = new Glock();
		
		Polis p1=new Polis(g1);
		Polis p2=new Polis(g2);
	}
}
