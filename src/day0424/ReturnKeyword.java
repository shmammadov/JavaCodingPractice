package day0424;

import java.util.Scanner;

public class ReturnKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a nuber");
		int num = scan.nextInt();
		if (num<0) {
			//once return keyword is reached, method finish
			return; 
		}
	}

}
