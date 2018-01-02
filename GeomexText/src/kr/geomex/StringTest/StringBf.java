package kr.geomex.StringTest;

public class StringBf {
	
	StringBuffer sb= new StringBuffer();
	
	public void test() {
		
		sb.append("JAVA");
		System.out.println(sb.toString());
		sb.append("programming");
		System.out.println(sb.toString());//toString()메소드는 객체가 가지고 있는 정보나 값들을 문자열로 만들어 리턴하는 메소드
		sb.replace(0, 4, "C++");//원하는 인덱스까지의 데이터를 자르고 새로운 문자열을 삽입 
		System.out.println(sb);
		sb.reverse();//문자열의 순서를 반전한다
		System.out.println(sb);
		String str=sb.substring(11);//substring(시작점,끝나는지점)원하는 지점 까지의 문자열을 자른다
		System.out.println(str);
		
	}
	
	public String append(String s) {
		sb.append(s);
		String str= sb.toString();
		System.out.println(s+"가 성공적으로 추가되었습니다");
		
		return str;
	}
	
	public String substring(int s,int e) {
		String str= sb.substring(s,e);
		
		return str;
	}
	
	
}
