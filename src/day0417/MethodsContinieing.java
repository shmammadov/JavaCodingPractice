package day0417;

import java.util.Scanner;

public class MethodsContinieing {
	public static void doubleTheNumber(int number) {
		number*=2;
		System.out.println(number);
	}
	
	public static void checkTheAge (int age) {
		if (age>18) {
			System.out.println("You are allowed to enter");
		}else {
			System.out.println("You are too young for this party :/");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		System.out.println("enter a number");
		int num = scan.nextInt();
		doubleTheNumber(num);
		
		System.out.println("enter your age");
		int myAge = scan.nextInt();
		checkTheAge(myAge);
	}

}
