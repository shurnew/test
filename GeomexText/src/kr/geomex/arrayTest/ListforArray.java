package kr.geomex.arrayTest;

public class ListforArray {
	int size =5;
	String[] array=new String[size];//�ѹ� ����� �迭�� ���̴� �ٲܼ� ����
	
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
			
		if(array[index]==null) {// �迭�ȿ� �����ִ����� üũ�ϱ�����  if��
			

			if(index<size) {//�迭�� ũ�⿡ ���� ���� �ִ� if��
				
				array[index]=str;
				
				System.out.println("���ο :"+array[index]);
				
			}else {
				
				System.out.println("�迭�� ���̸� �ʰ��� ���� �Է��Ͽ����ϴ�");
				
			}
			
			}else {//���� ���� ������
				
				for(int i=size-1;i>=index;--i) {//�迭�� ���� ���� ������ �迭�� �ε������� �ݺ�
					
					
					array[i]= array[i-1];//��ĭ�� �ε�����  �ڷιи���
					
					if(i==index) {
						
						array[index]=str;//�ٲ� �����͸� �־��ش�
					}
					
				}
				System.out.println("�ߺ���üũ : "+array[index]);
			}
			return true;
		}
	
}