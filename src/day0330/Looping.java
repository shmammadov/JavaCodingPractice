package day0330;

import java.util.Scanner;

public class Looping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter your name");
		
		String name = scan.next();
		int x = 0;
		int count = name.length()-1;
		 
		 while (x<=count) {
			 System.out.print(name.charAt(count));
			 count--;
		 }
	}}

