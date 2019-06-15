package day6;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int currentYear = 2019;
		Scanner input = new Scanner (System.in);
		System.out.println("enter your year of birth:");
		int birthYear = input.nextInt();
		System.out.println(currentYear - birthYear);
		
		
		///////////////////////////
		
		System.out.println("Enter byte value: ");
		byte b1 = input.nextByte();
		System.out.println("you entered " + b1);
		
		///////////////////////////
		
		System.out.println("enter a short value: ");
		short sh1 = input.nextShort();
		System.out.println("you entered " + sh1);
		
		////////////////////////
		
		System.out.println("enter a float value: ");
		float fl1 = input.nextFloat();
		System.out.println("you entered " + fl1);
		
		
		System.out.println("enter a float value: ");
		boolean bloN = input.nextBoolean();
		System.out.println("you entered " + fl1);
	}

}
