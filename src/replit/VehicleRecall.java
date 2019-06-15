package replit;

import java.util.Scanner;

public class VehicleRecall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scan = new Scanner (System.in);
			int vehicleYear;
			System.out.println("Enter vehicle's year:");
			vehicleYear = scan.nextInt();
			if(vehicleYear<1995 || vehicleYear > 2017 || vehicleYear ==1999 
					|| vehicleYear ==2000 || vehicleYear ==2003
					|| vehicleYear >= 2007 && vehicleYear <=2014 ){
				System.out.println("Your vehicle is fine, enjoy!");
			}
			
			else if (vehicleYear >= 1995 && vehicleYear <=2006 
					|| vehicleYear >= 2015 && vehicleYear <=2017) {
				System.out.println("Your vehicle needs to be recalled!");
			}
	}

}
