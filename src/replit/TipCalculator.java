package replit;

import java.util.Scanner;

public class TipCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Split: ");

		boolean split = input.nextBoolean();

		System.out.print("Number of people: ");

		int numOfPeople = input.nextInt();

		System.out.print("Check amount: ");

		double checkAmount = input.nextDouble();
		
		double tipExc = checkAmount*25/100, tipGreat=checkAmount*20/100, tipGood=checkAmount*15/100;
		double tipFair =checkAmount*10/100, tipPoor = checkAmount*5/100;
					
		System.out.println("Service Quality: ");

		String serviceQuality = input.next();
		if (serviceQuality.equalsIgnoreCase("Excellent")) {
			System.out.println("Number of people entered:" + numOfPeople);
			System.out.println("Total tip:" + tipExc);
			System.out.println("Tip per person: " + tipExc/numOfPeople);
			System.out.println("Total to pay:" + (tipExc+checkAmount));
			System.out.println("Total per person:" + (tipExc+checkAmount)/numOfPeople);
			
			
		}else if (serviceQuality.equalsIgnoreCase("Great")) {
			System.out.println("Number of people entered:" + numOfPeople);
			System.out.println("Total tip:" + tipGreat);
			System.out.println("Tip per person: " + tipGreat/numOfPeople);
			System.out.println("Total to pay:" + (tipGreat+checkAmount));
			System.out.println("Total per person:" + (tipGreat+checkAmount)/numOfPeople);
			
		}else if (serviceQuality.equalsIgnoreCase("Good")) {
			
			System.out.println("Number of people entered:" + numOfPeople);
			System.out.println("Total tip:" + tipGood);
			System.out.println("Tip per person: " + tipGood/numOfPeople);
			System.out.println("Total to pay:" + (tipGood+checkAmount));
			System.out.println("Total per person:" + (tipGood+checkAmount)/numOfPeople);
		}else if (serviceQuality.equalsIgnoreCase("Fair")) {
			System.out.println("Number of people entered:" + numOfPeople);
			System.out.println("Total tip:" + tipFair);
			System.out.println("Tip per person: " + tipFair/numOfPeople);
			System.out.println("Total to pay:" + (tipFair+checkAmount));
			System.out.println("Total per person:" + (tipFair+checkAmount)/numOfPeople);
		
		}else if (serviceQuality.equalsIgnoreCase("Poor")) {
			System.out.println("Number of people entered:" + numOfPeople);
			System.out.println("Total tip:" + tipPoor);
			System.out.println("Tip per person: " + tipPoor/numOfPeople);
			System.out.println("Total to pay:" + (tipPoor+checkAmount));
			System.out.println("Total per person:" + (tipPoor+checkAmount)/numOfPeople);
			
		}

	}

}
