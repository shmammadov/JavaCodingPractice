package day0407;

import java.util.Scanner;

public class ScannerArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int[]arrScan = new int[3];
		
//		System.out.println("enter 1st number:");
//		arrScan[0] = scan.nextInt();
//		System.out.println("enter 1st number:");
//		arrScan[1] = scan.nextInt();
//		System.out.println("enter 1st number:");
//		arrScan[2] = scan.nextInt();
		
		
		
		for (int i = 0; i < arrScan.length; i++) {
			System.out.println("number " + (i+1)+" number: ");
			arrScan[i] = scan.nextInt();

			System.out.println(arrScan[i]);
			
		}
		
		int max = arrScan[0];
		for (int i = 1; i<arrScan.length;i++) {
			if (arrScan[i]>max) {
				max = arrScan[i];
			}
			
		}
		System.out.println("max is: " + max);
	}

}
