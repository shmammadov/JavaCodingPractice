package day0327;

import java.util.Scanner;

public class LoopingTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int y = 10;
//		while (y>5) {
//			System.out.println("Hello Bala");
//			y--;
//		}
		
		//int x = 0;
		
		System.out.println("Enter a number");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int y =0;
		while (y<=num) {
			System.out.print(y);
			y++;
		}
	}

}
