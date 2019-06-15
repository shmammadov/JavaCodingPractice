package day0413;

import java.util.Scanner;

public class ForEachLoopTask_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] nums = new int[5];
		// int [] numbers =
		// {scan.next(),scan.next(),scan.next(),scan.next(),scan.next()}
		
		// get sum max and min fir each for loop

		System.out.println("enter 5 numbers");
		nums[0] = scan.nextInt();
		nums[1] = scan.nextInt();
		nums[2] = scan.nextInt();
		nums[3] = scan.nextInt();
		nums[4] = scan.nextInt();

		int sum = 0;
		for (int eachNum : nums) {
			sum += eachNum;
		}
		System.out.println("Sum is:" + sum);

		int max = nums[0];

		for (int eachNum : nums) {
			if (eachNum > max) {
				max = eachNum;
			}

		}
		
		System.out.println("max is:"+ max);
		int min = nums[0];

		for (int eachNum : nums) {
			if (eachNum < min) {
				min = eachNum;
			}

		}
		System.out.println("min is:" + min);
	}

}
