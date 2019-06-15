package replit;

import java.util.Scanner;

public class PrefixAgain_86 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int n = scan.nextInt();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(n-1) == str.charAt(i)) {
				count++;

			}

		}

		if (count > 1) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

}
