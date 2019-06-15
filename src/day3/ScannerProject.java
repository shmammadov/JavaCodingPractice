package day3;

import java.util.Scanner;

public class ScannerProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("°F to °C");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the degree:");
		int f = input.nextInt();
		System.out.println(f + " fahrenheit in celsius is" +" "+ (5.0/9*(f-32)));
		
		

	}

}
