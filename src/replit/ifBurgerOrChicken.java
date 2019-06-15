package replit;

import java.util.Scanner;

public class ifBurgerOrChicken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		float bc, soda;
		bc = 10;
		soda = 2;
		String in = s.next();
		if (in.equals("burger") || in.equals("chicken")) {
			System.out.println(bc);
		} else if (in.equalsIgnoreCase("soda")) {
			System.out.println(soda);
		}

	}

}
