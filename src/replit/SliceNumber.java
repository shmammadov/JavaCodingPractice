package replit;

import java.util.Scanner;

public class SliceNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,digit1, digit2, digit3, digit4, digit5;
		
//		Scanner scan = new Scanner(System.in);
//	    int num;
//		char digit1, digit2, digit3, digit4, digit5;
//	    
//	    System.out.println("Enter a number: ");
//	    String number  = scan.next();
//	   // digit1 = number.charAt(0);
//	    digit2 = number.charAt(1);
//	    digit3 = number.charAt(2);
//	    digit4 = number.charAt(3);
//	    digit5 = number.charAt(4);
//	    System.out.println(number.charAt(0));
//	    System.out.println(digit2);
//	    System.out.println(digit3);
//	    System.out.println(digit4);
//	    System.out.println(digit5);
		
		 Scanner scan = new Scanner(System.in);
		    System.out.println("Enter your number:");
		    num = scan.nextInt();
		    
		    digit5 = num%10;
		    digit4 = num/10%10;
		    digit3 = (num/10)/10%10;
		    digit2 = ((num/10)/10)/10%10;
		    digit1 = (((num/10)/10)/10)/10%10;
		    
		    System.out.println(digit1);
//		    System.out.println(digit2);
//		    System.out.println(digit3);
//		    System.out.println(digit4);
//		    System.out.println(digit5);
	}

}
