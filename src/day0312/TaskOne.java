package day0312;

import java.util.Scanner;

public class TaskOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int sum = a+b;
		if (sum >=100) {
			
			System.out.println("you have a great");
			
		}

		else {
			
			System.out.println("be more generous"); 
		}
	}

}
