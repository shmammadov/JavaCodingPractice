package day0331;

import java.util.Scanner;

public class UsernameAndPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		String uname ="";
		String pass= "";
		String cuname ="abc";
		String cpass= "123";
		
		do {
			System.out.println("enter your username");
			uname = scan.next();
			System.out.println("enter your passqord");
			pass = scan.next();
			//System.out.println("invalid username or password");
			//System.out.println("Please try it egain");
		}while (!(uname.equals("abc") && pass.equals("123")));
		System.out.println("you logged in successfully");
	}

}
