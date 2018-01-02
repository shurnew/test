package kr.geomex.controlTest;

import kr.geomex.petTest.Pet6;

public class TestIf_02 {

	
		Pet6 p =new Pet6();
		
	public void print() {
		
		p.printData(57);
		
		System.out.println("현재 개체수"+p.Population);
		
			if(p.Population>=p.MEX_POP) {
			
				System.out.println("농장의 최대 횽량은"+p.MEX_POP+"마리까지입니다");
			
				int i =p.Population-p.MEX_POP;
			
				p.printData(40);
		
				if(p.Population==40){
				
				System.out.println("허용된수를 초과하여 "+i+"마리를 방출하였습니다");
				
				System.out.println("조절된 개체수"+p.Population);
				
				}
		
		}
		
	}
	
}

	