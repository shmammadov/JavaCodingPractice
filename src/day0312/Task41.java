package day0312;

import java.util.Scanner;

public class Task41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner password = new Scanner(System.in);
		System.out.println("enter your password");
		
		String newpassword = password.next();
		
		System.out.println("retypr your pasword");
		String repassword = password.next();
		
		boolean checkIt = newpassword.equals(repassword);
		
		if (checkIt) {
			System.out.println("you have registered succesfully");
			
		}else {
			System.out.println("password does not match");
		}
		

	}

}
