package day0327;

import java.util.Scanner;

public class GimeMeFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int x = 0;
		while (x != 5) {
			
			System.out.println("Give me 5");
			x = scan.nextInt();
		}
			System.out.println("Good job!");
	}

}
