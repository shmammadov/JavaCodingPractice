package replit;

import java.util.Scanner;

public class ReverseLetters_211 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String word = "";
		word = scan.nextLine();
		String lettersOnly =word.replaceAll("\\W", " ");
		System.out.println(lettersOnly);
				
//		String sChar = "/*!@#$%^&*()\"{}_[]|\\?/<>,.";
//		
//		for (int i = 0; i < word.length(); i++) {
//			if(word.substring(i,i+1).contains(sChar)) {
//				continue;
//		}else {
//		
//			
//		}
		

	}

}
