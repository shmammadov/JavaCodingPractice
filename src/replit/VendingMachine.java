package replit;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int itemPrice, quarters, dimes, nickels;
		
		itemPrice = in.nextInt();
		if (itemPrice>25 && itemPrice<100 && itemPrice%5==0) {
		quarters = (100-itemPrice)/25;
		dimes = (100-itemPrice)%25/10 ;
		nickels = (100-itemPrice)%25%10 ;;
		//System.out.println("your change is " + quarters +"."+ dimes +"."+ nickels +".");
		System.out.println(quarters+" "+dimes+" "+nickels);
		}else {System.out.println("invalid value");}
		

	}

}