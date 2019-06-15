package day0312;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner number = new Scanner(System.in);

		int i = number.nextInt();
		int j = number.nextInt();

		if (i > 5 && (j % 2 == 1) || ((i + j) % 2 == 0)) {

			System.out.println("You got it");

		}

		else {
			System.out.println("Keep trying");
		}
	}

}
