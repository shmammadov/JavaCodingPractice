package day0327;

import java.util.Scanner;

public class SumOfDesiredNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		int enterNum = 0;
		int sum = 0;
		int count = 1;
		
		System.out.println("enter a num");
		enterNum = scan.nextInt();
		
		while (count <=enterNum) {
			
			sum = sum + count;
			
			System.out.println("current sum " + sum + " count is " + count);
			//System.out.println(count);
			count++;
		}
		System.out.println(sum);

	}

}
