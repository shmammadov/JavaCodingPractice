package replit;

import java.util.Scanner;

public class HasAJava_89 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 boolean exists = false;
		    Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    
			    if(word.length()<4) {
			    	System.out.println(exists);
			    }else if(word.substring(0,4).contains("java") || word.substring(1,5).contains("java")) {
			    	System.out.println(!exists);
			    }
			    	
			    else {
			    	System.out.println(exists);
			    }

	}

}
