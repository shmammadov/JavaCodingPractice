package day0331;

public class Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// break statemend is used to break out of switch statement and loops
		int x = 10;
		do {
			System.out.print(x + " ");
			x++;
			if (x>50) {
				
				break;
				
			}
		} while (x<100);
		

	}

}
