package kr.geomex.b.arrayTest;

public class DeleteArray {
	int size = 4;
//	String[] array=new String[size];
	String []array= {"�� ������ 0������","�� ������1������","�� ������3������","�� ������4������"};//�����Ҷ� ���� ���� �־��ش�
	
	public DeleteArray(){

		
		/*
		array[0]="�� ������ 0������";
		array[1]="�� ������1������";
		array[2]="�� ������2������";
		array[3]="�� ������3������";
		*/
	}
	
	public void printAll() {
		for(int i=0;i<size;i++ ) {
			
			System.out.println(array[i]);
			
		}
	}
	
	public void print(int index) {
		
			System.out.println(array[index]);
			
	}
	
	public boolean delete(int index) {
		System.out.println("�����ϱ��� ������ ���� : "+array[index]);
		if(index<size) {
		array[index]=null;
		System.out.println("���� �� �ش������ ���� : "+array[index]);
		}else{
			
			System.out.println("�迭�� ���̸� �ʰ��� ���� �Է��Ͽ����ϴ�");
		}
		return true;
	}
	
	public boolean insert(int index,String str) {
		
		if(index<size) {
			
			array[index]=str;
			System.out.println(index+"�� �ڸ��� ���� ����Ǿ����ϴ�");
		}else{
			
			System.out.println("�迭�� ���̸� �ʰ��� ���� �Է��Ͽ����ϴ�");
			
		}
		
		return true;
	}
	
}
