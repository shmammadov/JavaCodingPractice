package day0424;

public class GraderApp {
	public static char toLetterGrade(int score) {
		if (score <=90 && score>=100) {
			return 'A';
		}else if (score <=80 && score <90) {
			return 'B';
		}else if (score <=70 && score <80) {
			return 'C';
		}else if (score <=60 && score <70) {
			return 'D';
		}else   {
			return 'F';
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(toLetterGrade(80));
	}
	

}
