package day0420;

import java.util.Scanner;

public class Task3Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =  new Scanner (System.in);
		String user  = scan.next();
		String pass = scan.next();
		boolean check = scan.nextBoolean();
		
		login(user,pass,check);
	}
	public static void login (String u,String p, boolean c ) {
		System.out.println("Your username:"+ u);
		System.out.println("Your password:"+ p);
		if (c) {
			System.out.println("You saved the login credentials");
		}else {
			System.out.println("You did not save your loing credentials");
		}
	}

}
