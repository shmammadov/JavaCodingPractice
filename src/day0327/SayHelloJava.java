package day0327;

import java.util.Scanner;

public class SayHelloJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		String theAnswer = "";
		
		while (!theAnswer.equalsIgnoreCase("yes")) {
			
			System.out.println("Do you love Java?");
			theAnswer = scan.next();
			
		}
		
		System.out.println("Finnaly, Thank You!");

	}

}
