package day0326;

public class Loop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 0;
		while (x < 10) {
			System.out.println("even numbers " + ++x);
			//x+=2;
		}
        // Also
		
		int a = 0;
		while (a++ < 10) {
			System.out.println("even numbers " + a);
			//x+=2;
		}
	}

}
