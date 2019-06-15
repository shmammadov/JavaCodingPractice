package day0313;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner input = new Scanner("System.in");
		// TODO Auto-generated method stub
		int a = input.nextInt();
		int b = input.nextInt();
		String expression = input.next();
		
		boolean add = expression.equals("+");
		//boolean subs = expression.equals("-");
		//boolean mul = expression.equals("*");
		//boolean dev = expression.equals("/");
		
		if (expression.equals("+")) {
			System.out.println(a+b);
		}
			
			
		}

		
	}	