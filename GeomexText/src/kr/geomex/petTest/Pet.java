package kr.geomex.petTest;

public class Pet {
	public final int MEX_AGE=10;//final�� ����� ǥ�� ����� �������� �빮�ڷ��Ѵ� 
	public int age = 1;//JAVA ���� ������ ǥ���K�� ��κ� INT���k ����
	public String name = "�̸��� �������ּ���";
	public double weight =00.00;//�Ǽ��� ǥ���Ҷ� �ַ� double���� ���� ����Ѵ�0
	
	public Pet() {
	}//�����ڴ� ��ȯ���� ���� Ŭ������� ����
	 
	public void printData(){
		System.out.println("�̸� "+name+" ���� "+age+" ������ "+weight);
	}
	public void setData(String name, int age, double w) {
		if(age<=0||w<0) {
			System.out.println("���� �Ǵ� �����Դ� 0���������������ϴ�");
			return;
		}else if(age>MEX_AGE) {
			System.out.println("���̴� 10���� Ŭ�������ϴ�");
			return;
		}
		/**
		 * this�� �ǹ̴� �޸𸮰� �Ҵ�Ǿ����� �ڱ��ڽ��� �޹��Ѵ�
		 */
		this.name=name;
		this.age=age;
		this.weight=w;
	} 
	
}
