package day0327;

import java.util.Scanner;

public class Bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =  new Scanner(System.in);
		int a = 0;
		//int b = 0;
		System.out.println("enter bill ");
		while (a != 5 && a!=10 ) {
			  // while ( !(x==5 || x==10) )
			System.out.println("Give me $5 or $10 ");
			a = scan.nextInt();
		}
		
		System.out.println("Thank you for your purches ");
	}

}
