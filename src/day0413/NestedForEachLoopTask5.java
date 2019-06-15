package day0413;

import java.util.Scanner;

public class NestedForEachLoopTask5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =  new Scanner (System.in);
		System.out.println("enter a sentence");
		String sentence = scan.nextLine();
		
		String [] words = sentence.split(" ");
		
		for (String eachWord : words) {
			
			//System.out.println(eachWord + " ");
			char[] charsFromWords = eachWord.toCharArray();
			for ( char c : charsFromWords) {
				System.out.print(c+"-");
			}
			System.out.println();
		}

	}

}
