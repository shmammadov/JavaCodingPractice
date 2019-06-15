package replit;

import java.util.Scanner;

public class RepeatSeperator_85 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		String separator = scan.next();
		int count = scan.nextInt();
		System.out.print(word);
		if (count > 1) {

			for (int i = 1; i < count; i++) {

				System.out.print(separator + word);

			}

		}
	}

}