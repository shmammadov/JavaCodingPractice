package replit;

import java.util.Scanner;

public class Email_71 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
		 String email = scan.next();
//		    String word1 = email.substring(0,email.indexOf("_"));
//		    String word2 =  email.substring(email.indexOf("_")+1,email.indexOf("@"));
//		    String word3 = email.substring(email.indexOf("@")+1,email.length());
		    if (email.contains("_")) {
		    	
			    String word1 = email.substring(0,email.indexOf("_"));
			    String word2 =  email.substring(email.indexOf("_")+1,email.indexOf("@"));
			    String word3 = email.substring(email.indexOf("@")+1,email.length());
		    	System.out.println(word2+"_"+word1+word3);
		    	
		    }else {
		    	System.out.println(email);
		    }
		    
	}

}
