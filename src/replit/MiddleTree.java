package replit;

import java.util.Scanner;

public class MiddleTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    int x = word.length();
	    
	    if (x%2==1 && x>=5) {
	    	System.out.println(word.substring(x/2-1,x/2+2));
	    }else {
	    	System.out.println("Invalid");
	    }

	}

}
