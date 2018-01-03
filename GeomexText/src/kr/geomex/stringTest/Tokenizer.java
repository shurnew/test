package kr.geomex.stringTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Tokenizer {
	ArrayList<String> list =new ArrayList<String>(); 

	StringTokenizer st1= new StringTokenizer("ȫ�浿 �ڱ��� �ֱ���");//�и��� ����
	
	StringTokenizer st2= new StringTokenizer("2017-12-31","-");// �и���-
	
	int tokencount =st2.countTokens();

	
	
	
	public void test() {
		
		System.out.println("��ū ���� ="+tokencount);
		
		while(st2.hasMoreTokens()) {//���� ��ū �� �����Ҷ� true ���� ���S
			System.out.println(st2.nextToken());
		}
		
		//��ū�� �����ؼ� �и�
		StringTokenizer st3= new StringTokenizer("2017-12-31","-",true);
		while(st3.hasMoreTokens()) {//���� ��ū �� �����Ҷ� true ���� ���S
			System.out.println(st3.nextToken());
		}
	}
	
	public void add(String var) {
		
		System.out.println("�Է��Ѱ� : "+var);
		
		StringTokenizer st3= new StringTokenizer(var,"-");
		
		while(st3.hasMoreTokens()) {//���� ��ū �� �����Ҷ� true ���� ��ȯ
			
			list.add(st3.nextToken());
			
		}
		
		
	}
	
	public void print() {
		
		Iterator ai = list.iterator();
		
		while(ai.hasNext()) {
			
			System.out.println(ai.next());
			
		}
		
	}
	
	
	
}
