package day0331;

import java.util.Scanner;

public class Counter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		Scanner input = new Scanner (System.in);
		int count = 0;
		int x = 0;

		String word = input.next();

		while (x < word.length()) {

			char c = word.charAt(x);
			if (c == 'm' || c=='M') {
				System.out.println("position of m is " + x);
				count++;

			}
			//System.out.print(word.charAt(x));
			x++;

		}
		System.out.println("total m's :" + count);
	}

}
