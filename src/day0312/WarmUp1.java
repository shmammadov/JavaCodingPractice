package day0312;

import java.util.Scanner;

public class WarmUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner number = new Scanner(System.in);
		
		int a = number.nextInt();
		int b = number.nextInt();
		int sum = a + b;
		
		if (sum>100) {
			
			System.out.println("You have it!!");
		}
		else {
			
			System.out.println("Sorry");
		}
	}

}
