package replit;

import java.util.Scanner;

public class AprCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Please enter your APR: ");
		double rate = scan.nextDouble();
		System.out.print("Please enter your Cycle Days: ");
		double cycleDays = scan.nextDouble();
		System.out.print("Please enter your balance: ");
		double balance = scan.nextDouble();
		
		double result = rate/365*0.01*balance*cycleDays;
		
		System.out.println("Your APR fee is: "+ result);

	}

}
