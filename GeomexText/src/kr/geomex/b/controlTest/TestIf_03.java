package kr.geomex.b.controlTest;

import kr.geomex.petTest.Pet6;

/**
 * 
 * @version 	2017-12-28
 * @author 		�ż�ȣ
 */
public class TestIf_03 {
	
	Pet6 p =new Pet6();
		
	public void print() {
		
		System.out.println("���� ��ü��"+p.Population);
		
		if(p.Population==p.MEX_POP||p.Population>=p.MEX_POP) {
		
			p.printData(40);
			
			if(p.Population==40) {
				boolean b=(p.Population%2)<0;
				System.out.println("���ȼ��� �ʰ��Ͽ� �����Ͽ����ϴ�");
			
				if(b!=true) {
					System.out.println("���� ��ü��"+p.Population);
					p.printData(0);
				}
				
			}
		}
	}
}

