package logic;

public class Main {

	public static void main(String[] args) {
		
		//TODO: Implement StringBuilder.
		
		// Generate new Question.
		Question q = new Question();
		// Print the question.
		System.out.println(q.returnQuestion());
		// Print the question value sum.
		System.out.println(q.returnGcsValue());
	}
}