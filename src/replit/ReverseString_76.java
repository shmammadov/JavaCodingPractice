package replit;

import java.util.Scanner;

public class ReverseString_76 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();
		for (int i = sentence.length() - 1; i >= 0; i--) {
			System.out.print(sentence.charAt(i));
		}

	}

}
