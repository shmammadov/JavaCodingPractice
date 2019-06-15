package replit;

import java.util.Scanner;

public class CountJava_87 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
	    String word = scan.next();
	    int count=0;
	    
//	    if(word.equals("java")){
//	        count++;
//	      }
	    for(int i = 0; i<word.length()-3; i++){
	    	if(word.substring(i,i+4).contains("java")){
	        count++;
	      }
	    }
	    System.out.println(count);
	  }
	
	//  if(word.substring(i,word.length()).contains("java")){


}
