package replit;

import java.util.Scanner;

public class Cats_Dogs_88 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int countOfCats = 0;
		int countOfDogs = 0;
		String word = scan.next();
		
		for (int i = 0; i < word.length()-2; i++) {
			
			if(word.substring(i,i+3).contains("cat")) {
				countOfCats++;
			}
			if(word.substring(i,i+3).contains("dog")) {
				countOfDogs++;
			}
			
			
		}
//		
//		System.out.println(countOfCats);
//		System.out.println(countOfDogs);
		if(countOfCats==countOfDogs) {
			
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}

}
