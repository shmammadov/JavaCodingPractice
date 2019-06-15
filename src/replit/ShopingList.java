package replit;

import java.util.Scanner;

public class ShopingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in); 
		
		String item1,item2, item3;
		double price1,price2,price3 = 0;
			

		System.out.println("enter item1 and its price: ");
		item1 =scan.next();
		price1 = scan.nextDouble();		
		
		System.out.println("enter item2 and its price: ");
		item2 =scan.next();
		price2 = scan.nextDouble();

		System.out.println("enter item3 and its price: ");
		item3 =scan.next();
		price3 = scan.nextDouble();

	

	}

}
