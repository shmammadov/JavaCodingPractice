package replit;

import java.util.Scanner;

public class StringNoEnd_79 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String txt = s.next();
		// your code here
		System.out.println(txt.substring(0, txt.length() - 1));
	}

}
