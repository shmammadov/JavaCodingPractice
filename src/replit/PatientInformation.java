package replit;

import java.util.Scanner;

public class PatientInformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner userInput = new Scanner(System.in);
	
	String firstName, lastName, fullName, email, street, state, city, address, contacts;
	int age, zipCode;
	double height, weight;
	boolean isMarried;
	long workPhoneNumber, personalPhoneNumber;
	
	System.out.println("Welcome to the patient portal!");
	System.out.println("Please enter your personal information");
	
	System.out.println("Enter your first name");
	firstName = userInput.next();
	
	System.out.println("Enter your last name");
	lastName = userInput.next();
	
	System.out.println("Enter your email");
	email = userInput.next();
	userInput.nextLine();
	
	System.out.println("Enter your street");
	street = userInput.nextLine();
	
	System.out.println("Enter your city");
	city = userInput.nextLine();
	
	System.out.println("Enter your state");
	state = userInput.nextLine();
	
	System.out.println("Enter your zip code");
	zipCode = userInput.nextInt();
	
	System.out.println("Enter your work phone #");
	workPhoneNumber = userInput.nextLong();
	
	System.out.println("Enter your personal phone #");
	personalPhoneNumber = userInput.nextLong();
	
	System.out.println("Enter your age");
	age = userInput.nextInt();
	
	System.out.println("Enter your height");
	height = userInput.nextDouble();
	
	System.out.println("Enter your weight");
	weight = userInput.nextDouble();
	
	System.out.println("Are you married?");
	isMarried = userInput.nextBoolean();
	
	fullName = firstName +","+lastName;
	contacts = "work phone number -" + workPhoneNumber+", personal phone number - " +personalPhoneNumber + " email: " + email;
	address = "Adress: " + street +","+ city +","+ state +" "+zipCode;
	
	System.out.println(street);
	System.out.println(fullName);
	System.out.println(address);
	System.out.println(contacts);
	System.out.println(age);
	System.out.println(height);
	System.out.println(weight);
	System.out.println(isMarried);
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
