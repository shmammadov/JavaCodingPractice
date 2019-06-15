package replit;

import java.util.Scanner;

public class SocondsConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int inputSeconds, hours, minutes, seconds;
		
		
//		System.out.print("Enter seconds:");
	inputSeconds = scan.nextInt();

	 hours = inputSeconds/60;
	 
		hours = inputSeconds /3600;
		minutes= (inputSeconds %3600)/60;
		seconds= (inputSeconds %3600)%60;
		System.out.println(hours +"."+ minutes+"."+seconds);
	 
	 	
	}

}
