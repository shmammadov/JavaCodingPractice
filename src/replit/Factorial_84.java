package replit;

import java.util.Iterator;
import java.util.Scanner;

public class Factorial_84 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
		 long num = scan.nextLong();
		 long  fact = 1;
		 for(long i = 2; i<=num; i++) {
			fact *=i;
			 //System.out.println(fact*fact);
		 }
		 System.out.println(fact);
	}

}
