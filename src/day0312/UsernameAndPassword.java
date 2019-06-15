package day0312;

import java.util.Scanner;

public class UsernameAndPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter your username");
		String username = input.next();
		
		System.out.println("enter your password");

		String password = input.next();
		String correctUsername = "admin"; 
		String correctPassword = "Spring2019";
		
		//boolean cp = password.equals("Spring2019")
		//boolean cu =  username.equals("admin")
		
		//if (correctUsername && correctPassword)
		//if(correctUsername==true && correctPassword==true)
		//if (password.equals("Spring2019") && username.equals("amdin"))
		
		if (password.equals(correctPassword) && username.equals(correctUsername)) {
			
			System.out.println("you logged in succesfully");
		}else {
			System.out.println("incorrect username or password");
		}

	}

}
