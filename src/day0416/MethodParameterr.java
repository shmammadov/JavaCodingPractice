package day0416;

import java.util.Scanner;

public class MethodParameterr {

	public static void countDown(int countDown) {

		for (int i = countDown; i >= 0; i--) {
			System.out.println(i);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// holdYourHorse("Fatma");
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a starting number");
		int userInput = scan.nextInt();
		countDown(userInput);

	}

}
