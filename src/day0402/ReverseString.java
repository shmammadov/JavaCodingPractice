package day0402;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		String name = "";
		name = scan.nextLine();
		for (int i = name.length()-1; i >= 0; i--) {
			System.out.print(name.charAt(i) + " ");
		}

	}

}
