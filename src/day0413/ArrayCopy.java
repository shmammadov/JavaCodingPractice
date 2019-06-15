package day0413;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] heros = {"Ali","Hamza","Salahaddin","Halid"};
		
		String [] copyOfHeros = new String[heros.length];
		
		for (int i = 0; i < copyOfHeros.length; i++) {
			 copyOfHeros[i]=heros[i];
		}
		
		Arrays.sort(copyOfHeros);
		
		System.out.println(Arrays.toString(copyOfHeros));
		
//		
////		for (String eachHero: heros) {
////			System.out.println(eachHero);
////		}
		
//		String[] dcComicHeros = {"Superman",
//	            "Batman",
//	            "Aquaman",
//	            "Wonder Woman",
//	            "The Flash"
//	            ,"Green Lantern",
//	            "Vasyl"
//	          } ;  
//	    
//	    String[] herosCopied = new String[ dcComicHeros.length] ; 
//	    for (int i = 0; i < herosCopied.length; i++) {
//	      herosCopied[i] = dcComicHeros[i] ; 
//	    }
//
//	    System.out.println( Arrays.toString( herosCopied) );
//	    
////	    // Sort this array 
////	    // use for each loop to loop through all of them 
////	    // if this array has the hero you are looking for 
////	    // print Bingo 
//	//    
//	    Arrays.sort(herosCopied);
//	    System.out.println( Arrays.toString( herosCopied) );
//	    System.out.println( Arrays.toString( dcComicHeros) );

	}

}
