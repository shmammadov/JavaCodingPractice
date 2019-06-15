package day0313;

import java.util.Scanner;

public class AmazonPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter the product price");
		double price = input.nextDouble();
		System.out.println("You are a prime member?");
		boolean youPrimeMember = input.nextBoolean();
		int ship = 5;
		if (youPrimeMember || price >35) {
			
			System.out.println("your total is " + price);
			
		}else if (youPrimeMember==false || price <35) {
			System.out.println("your total is " + (price+ship) + " Note: $5 shipping fee");
		}
		
		

	}

}
