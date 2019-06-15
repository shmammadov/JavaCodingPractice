package day6;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("enter number 1");
		int num1 = input.nextInt();
		
		System.out.println("enter number 2");
		int num2 = input.nextInt();
		
		boolean isGreater = num1 > num2 ;
		
		System.out.println("is number 1 greather than number 2 " + isGreater);
	}

}
