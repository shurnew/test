package kr.geomex.controlTest;

import kr.geomex.petTest.Pet6;

public class TestIf_02 {

	
		Pet6 p =new Pet6();
		
	public void print() {
		
		p.printData(57);
		
		System.out.println("���� ��ü��"+p.Population);
		
			if(p.Population>=p.MEX_POP) {
			
				System.out.println("������ �ִ� �O����"+p.MEX_POP+"���������Դϴ�");
			
				int i =p.Population-p.MEX_POP;
			
				p.printData(40);
		
				if(p.Population==40){
				
				System.out.println("���ȼ��� �ʰ��Ͽ� "+i+"������ �����Ͽ����ϴ�");
				
				System.out.println("������ ��ü��"+p.Population);
				
				}
		
		}
		
	}
	
}

	