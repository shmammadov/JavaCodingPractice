package day0414;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMethodsReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] words = {"coding", "start","to","Day","Perfect","Sunday"};
		Arrays.sort(words);
		String [] first2words = Arrays.copyOf(words, 2);
		System.out.println(Arrays.toString(first2words));
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter a new word");
		String usersWord = scan.next() ; 
	     
	     String[] newWords = Arrays.copyOf(words, words.length + 1) ; 
	     System.out.println( Arrays.toString(newWords) );
	     
	     int lastSpotIndex = newWords.length-1 ; 
	     newWords[lastSpotIndex] = usersWord ; 
	     System.out.println( Arrays.toString(newWords) );
	     
	     String[] codingStart = Arrays.copyOfRange(words,3,4+1) ; 
	     System.out.println( Arrays.toString(codingStart) );

	}

}
