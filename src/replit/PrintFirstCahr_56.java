package replit;

import java.util.Scanner;

public class PrintFirstCahr_56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word");
		String word = scan.next();
		System.out.println(word.charAt(0));
		System.out.println(word.charAt(word.length()-1));

	}

}
