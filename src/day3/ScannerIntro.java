package day3;
//import scanner class to define the location


import java.util.Scanner;


public class ScannerIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// create a Scanner object
		
		Scanner userInput = new Scanner(System.in);
		
		//ask user questions
		System.out.println("Enter your name");
		
		// store users input
		String name =userInput.next();
		
		//print what user input
		System.out.println("Hi " + name);
	}

}
