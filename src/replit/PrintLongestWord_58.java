package replit;

import java.util.Scanner;

public class PrintLongestWord_58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1st word");
		String word1 = scan.next();

		System.out.println("Enter 2nd word");
		String word2 = scan.next();
		if (word1.length() < word2.length())
			System.out.println(word2);
		else
			System.out.println(word1);
	}

}
