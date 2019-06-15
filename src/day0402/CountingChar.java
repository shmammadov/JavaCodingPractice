package day0402;

import java.util.Scanner;

public class CountingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		String name = "AAccBBdEEEf";
		String storedChar = "";
		for (int i = 0; i < name.length(); i++) {
			//storedChar += name.charAt(i);
			if (!storedChar.contains(name.charAt(i)+"")) {
				storedChar+=name.charAt(i);
				
			}
			
			
		}
		System.out.println(name);
		System.out.println(storedChar);

	}

}
