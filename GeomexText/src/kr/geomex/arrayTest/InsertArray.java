package kr.geomex.arrayTest;

public class InsertArray {
	int pos=0;
	String [] str = new String[5];
	
	public boolean insert(String s) 
	{
		if(pos<=str.length) {
		
		str[pos] = s;
	
		System.out.println(str[pos]);
		pos++;
		}
		else {
			System.out.println("��������� ���� ������ �Է��Ҽ������ϴ�");
		}
		return true ;
	}
	
	public boolean print(int index) 
	{
		
		if(index<=str.length&& index>=(-1)){
			
			System.out.println(str[index]);
		
		}
		
		else {
		
			System.out.println("0~4�����Ǽ��� �Է����ּ���");
		}
	
		return true ;
	}
}
