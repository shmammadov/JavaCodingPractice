package day0526;

public class Assesment {
	int questionCount ;
	int score;
	String type;
	
	
	static int timeLimit;
	public static void  printTimeLimit() {
		System.out.println("time limit"+timeLimit);
	}

	@Override
	public String toString() {
		return "Assesment [questionCount=" 
	+ questionCount + ", score=" + score 
	+ ", type=" + type + "]";
	}
	
	
	
}
