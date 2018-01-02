package kr.geomex.question;

public class QuestionMain {
	
	public static void main(String[] args) {
		
		Question question = new Question();
		
		question.setInit();
		
		question.chooeseSet(question.set1, question.set2);
		
		question.print();
	}
}
