package day0420;

import java.util.Scanner;

public class Claculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		String opp =  scan.next();
//		add(num1,num2);
//		subs(num1,num2);
//		mult(num1,num2);
//		div(num1,num2);
//		mod(num1,num2);
		
		calculate(opp,num1,num2);
	}
	
	public static void add(int a, int b) {
		System.out.println(a+b);
		
	}
	public static void subs(int a, int b) {
		System.out.println(a-b);
		
	}
	public static void mult(int a, int b) {
		System.out.println(a*b);
		
	}
	public static void div(int a, int b) {
		System.out.println(a/b);
		
	}
	public static void mod(int a, int b) {
		System.out.println(a%b);
		
	}
	
	public static void calculate(String asmd, int a, int b) {
		if (asmd.equals("+")) {
			System.out.println(a+b);
		}else if (asmd.equals("-")) {
			System.out.println(a-b);
		}else if (asmd.equals("*")) {
			System.out.println(a*b);
		}else if (asmd.equals("/")) {
			System.out.println(a/b);
		}else if (asmd.equals("%")) {
			System.out.println(a%b);
		}else {
			System.out.println("invalid operator");
		}
	}

}
