package kr.geomex.a.main;

import kr.geomex.interfaceTest.Glock;
import kr.geomex.interfaceTest.M4Camo;
import kr.geomex.interfaceTest.Polis;

public class PolisMain {
	
	public static void main(String[] args) {
		
		Polis p1=new Polis(new M4Camo());
		Polis p2=new Polis(new Glock());
	}
}
