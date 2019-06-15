package replit;

import java.util.Scanner;

public class PartyGuest_83 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		// your code
		// ------------------------------------------
		String name = "";
		String answer = "";
		String guest = "";
		while (!answer.equals("no")) {
			System.out.println("Please enter guest name:");
			name = input.next();
			System.out.println("Do you want to enter new guest name:");
			answer = input.next();

			guest = guest + ", " + name;

		}
		System.out.println("Guest's list:" + guest.substring(1));

	}

}
