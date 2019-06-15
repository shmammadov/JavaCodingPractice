package day0331;

import java.util.Scanner;

public class DoWhileSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int x = 0;
		int sum = 0;
		do {
			sum += x;
			x++;
			if (sum>=40) {
				//sum-=num;
				break;
			}
		} while (x <= num);
		System.out.println(sum);

	}

}
