package day0420;

import java.util.Scanner;

public class MethodWithMultipleParamenters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.println("give me a word");
		String word = scan.next();
		System.out.println("tell me how many times you want to repeat the word");
		int num = scan.nextInt();
		repeatString(word, num);
		
	}
	
	public static void repeatString (String word, int num) {
		for (int i = 1; i < num; i++) {
			System.out.print(word + " ");
		}
		System.out.println();
	}

}
