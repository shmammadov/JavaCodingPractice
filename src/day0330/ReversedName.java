package day0330;

import java.util.Scanner;

public class ReversedName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter your name");
		String reversed ="";
		String name = scan.next();
		int x = 0;
		int count = name.length()-1;
		 
		 while (x<=count) {
			 reversed += name.charAt(count);
			 count--;
		 }
		 
		 System.out.println("reversred palindrome " + name.equals(reversed));
	}

}
