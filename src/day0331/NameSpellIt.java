package day0331;

import java.util.Scanner;

public class NameSpellIt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		String name = "";
		var x = 0;
		name = input.next();
		do {
			
			System.out.print(name.charAt(x)+ " ");
			x++;
		}while (x<name.length());
//		name = input.next();
//		while (x<name.length()) {
//			
//			System.out.print(name.charAt(x) + " ");
//			x++;
//		}
		System.out.println("done");
	}

}
