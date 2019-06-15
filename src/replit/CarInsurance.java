package replit;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class CarInsurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);

				double premium = 0;
				int accidentsAmount = 0;
				int daysDrivenToWorkOrSchool = 0;
				int milesToWorkOrSchool = 0;
				int zipCode = 0;
				int age = 0;
				int experince = 0;
				String vehicleOwnership = "";
				String vehicleUsage = "";
				String continuousInsurance = "";
				String education = "";
				String isAccident ="";
				
				
				
				System.out.println("Welcome to the CountyFarm car insurance!");
				System.out.print("Enter your name: ");
				String name = scan.nextLine();
				
				System.out.print("Do you have a US driver license? ");
				String isDriverLicense = scan.next();
				if (isDriverLicense.equalsIgnoreCase("No")) {
					System.out.print("Invalid data!");
					System.exit(0);
				}
				System.out.print("Enter your zip code: ");
				zipCode = scan.nextInt();
				
				if(zipCode==20910 || zipCode == 20740)
				{
					premium = premium + 60;
				}else if (zipCode == 22102 || zipCode == 22103) {
					premium = premium + 30;
				}else {
					premium = premium + 50;
				}
				
				System.out.print("Is this vehicle Owned, Financed, or Leased? ");
				vehicleOwnership = scan.next();
				if (vehicleOwnership.equals("Owned")) {
					premium = premium + 10;
				}else {
					premium = premium +20;
				}
				
				System.out.print("How is this vehicle primarily used? ");
				vehicleUsage = scan.next();
				if(vehicleUsage.equals("Business")) {
					premium = premium +50;				
				}else if (vehicleUsage.equals("Pleasure")) {
					premium = premium +10;				
				}else if (vehicleUsage.equals("Commute")) {
					premium = premium +20;		
					System.out.print("Days Driven To Work And/Or School? ");
					daysDrivenToWorkOrSchool = scan.nextInt();
					premium = premium + (daysDrivenToWorkOrSchool *5);
					
				}
				
				System.out.print("Miles Driven To Work And/Or School");
				milesToWorkOrSchool =scan.nextInt();
				premium = premium + (milesToWorkOrSchool *1);
				System.out.print("How old are you");
				age = scan.nextInt();
				if (age<16) {
					System.out.print("Invalid data!");
					System.exit(0);
					
				}else if (age==17) {
					premium = premium * 20;
				}else if ( age >= 18 && age <= 21) {
					premium = premium * 6;
				}else if ( age > 21 && age < 25) {
					premium = premium * 2;
				}
				System.out.print("How many years you've been driving?");
					experince = scan.nextInt();
					if (experince <= 0 && (age-experince)<16) {
						System.out.print("Invalid value");
						System.exit(0);
					}
					System.out.print("Have you had any accidents in the last 5 years?");
					isAccident = scan.next();
					if (isAccident.equalsIgnoreCase("Yes")) {
						System.out.print("How many times accidents you have had? ");
						accidentsAmount = scan.nextInt();
						premium *= (premium * 0.2)*accidentsAmount ;//bug
						
					}
					
					System.out.print("Have you had continuous insurance for the past 12 months?");
					continuousInsurance = scan.next();
					if (continuousInsurance.equalsIgnoreCase("no")) {
						premium *= 2;
					}
					System.out.print("What is the highest level of education you have completed?");
					education = scan.next();
					if (education.equalsIgnoreCase("PhD") ||education.equalsIgnoreCase("Bachelors") ||education.equalsIgnoreCase("Masters")) {
						premium = premium - (premium * 0.05);
					}else if(education.equalsIgnoreCase("Doctors")) {
						premium = premium - (premium * 0.1);
					}else {
						premium = premium + (premium * 0.05);
					}
				System.out.println("Dear " + name +"here's your quote");
				System.out.println("Start Your Policy Today For: $"+premium);
				String referenceNumber = name.substring(0,2)+age+name.substring(name.length()-2,name.length())+zipCode+education.toUpperCase();
				String up = referenceNumber.toUpperCase(); 
				System.out.println("Your reference number: "+up);


	}

}
