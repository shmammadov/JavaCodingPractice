package day0323;

import java.util.Scanner;

public class AmazonSearchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		//ask user to items to search for
		//verify the tab neame has change to Amazon.com:youText
		
		System.out.println("Enter items to seatch for: ");
		String searchedItem = scan.nextLine();
		System.out.println("you have entered:" + searchedItem);
		
		String expectedResult = "Amazon.com:iPad";
		
		String actualResult = "Amazon.com:" + searchedItem;
		
		if(expectedResult.equals(actualResult)) {
			System.out.println("test pass for iPad");
		}else {
			System.out.println("test fail for iPad");
			
		}
		
		
		
		

	}

}
