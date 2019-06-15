package day0326;

public class Loop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int x = 0;
//		while (x <= 10) {
//			System.out.println("even numbers " + x);
//			x+=2;
//		}
//		
//		int x = 0;
//		while (x <= 10) {
//			if (x%2==0)
//			System.out.println("even numbers " + x);
//			x+=1;
//		}
		
		int a = 50;
		while (a <= 100) {
			if (a%2==1 && a > 50 && a<70) { // a%2 != 0 
			System.out.println("odd numbers " + a);
			}
			a+=1;
		}


	}

}
