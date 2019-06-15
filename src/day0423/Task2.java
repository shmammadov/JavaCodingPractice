package day0423;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		System.out.println("enter your age");
		int age = scan.nextInt();
		boolean result = isAdultOrNot(age );
		System.out.println(result);
		
		if (result) {
			System.out.println("You can join to this party");
		}else {
			System.out.println("Sorry, you cannot join to this party");
		}
	}

	public static boolean isAdultOrNot(int a) {
		if (a > 18) {

			return true;
		} else {
			return false;
		}
		//return a>18;

	}

}
