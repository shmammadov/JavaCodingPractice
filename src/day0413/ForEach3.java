package day0413;

import java.util.Scanner;

public class ForEach3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);	
//		System.out.println("enter a word");
//		String word = scan.next();
		
//		char [] wordChars = word.toCharArray();
//		
//		for (char eachChar : wordChars) {
//			
//			System.out.print(eachChar + "-");
//		}
		//System.out.println();
		
		System.out.println("enter a sentence");
		String sentence = scan.nextLine();
		
		String [] words = sentence.split(" ");
		
		for (String eachWord : words) {
			
			System.out.print(eachWord + "-");
		}
		

	}

}
