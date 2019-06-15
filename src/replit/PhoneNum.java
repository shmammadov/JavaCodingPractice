package replit;

import java.util.Scanner;

public class PhoneNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		
		int areCode = input.nextInt();
		int localNum = input.nextInt();
		
		String phoneNum = "(" + areCode + ")" + localNum;
		
		System.out.println("Caling number" + phoneNum);

	}

}
