package day3;

import java.util.Scanner;

public class Scanner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		// create a Scanner object
		
		Scanner userInput = new Scanner(System.in);
		
		//ask user questions
		System.out.println("Enter your name");
		
		// store users input (read one word)
		//String name =userInput.next();
		// store users input (read all line)
		String sentance = userInput.nextLine();
		
		//print what user input
		System.out.println("Hi " + sentance);

	}

}
