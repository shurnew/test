package kr.geomex.b.controlTest;

import kr.geomex.petTest.Pet6;

/**
 * 
 * @version 	2017-12-28
 * @author 		신선호
 */
public class TestIf_03 {
	
	Pet6 p =new Pet6();
		
	public void print() {
		
		System.out.println("현재 개체수"+p.Population);
		
		if(p.Population==p.MEX_POP||p.Population>=p.MEX_POP) {
		
			p.printData(40);
			
			if(p.Population==40) {
				boolean b=(p.Population%2)<0;
				System.out.println("허용된수를 초과하여 방출하였습니다");
			
				if(b!=true) {
					System.out.println("현재 개체수"+p.Population);
					p.printData(0);
				}
				
			}
		}
	}
}

