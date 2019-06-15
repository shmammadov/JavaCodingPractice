package replit;

import java.util.Scanner;

public class BuildaRout_73 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String start = scan.next();
		String end = scan.next();
		if (start.equals(end)) {
			System.out.println(start + " found");
		}

		switch (start) {

		case "A":
			switch (end) {
			case "B":
				System.out.println("right: " + end + " found");
				break;
			case "C":
				System.out.println("right > down: " + end + " found");
				break;
			case "D":
				System.out.println("right > down > left:  " + end + " found");
				break;
			default:
				break;

			}

		break;
		
		case "B":
			switch (end) {
			case "C":
				System.out.println("down: " + end + " found");
				break;
			case "D":
				System.out.println("down > left:  " + end + " found");
				break;
			case "A":
				System.out.println("down > left > up:  " + end + " found");
				break;
			default:
				break;

			}
		break;
		
		
		case "C":
			switch (end) {
		
			case "D":
				System.out.println("left:  " + end + " found");
				break;
			case "A":
				System.out.println("left > up:  " + end + " found");
				break;
			case "B":
				System.out.println("left > up > right: " + end + " found");
				break;
			default:
				break;

			}
		break;
		
		
		case "D":
			switch (end) {
			case "A":
				System.out.println("up:  " + end + " found");
				break;
			case "B":
				System.out.println("up > right: " + end + " found");
				break;
			case "C":
				System.out.println("up > right > down:  " + end + " found");
				break;
			default:
				break;

			}

		break;

		default:
		break;
		}

	}

}
