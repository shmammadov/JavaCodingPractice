package day0414;

import java.util.Arrays;
import java.util.Scanner;

public class CopyAddNewItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String [] words = {"coding", "start","to","Day","Perfect","Sunday"};

		System.out.println("Enter a new word");
		String usersWord = scan.next();

		String[] newWords = Arrays.copyOf(words, words.length + 1);
		System.out.println(Arrays.toString(newWords));

		int lastSpotIndex = newWords.length - 1;
		newWords[lastSpotIndex] = usersWord;
		System.out.println(Arrays.toString(newWords));

	}

}
