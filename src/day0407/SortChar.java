package day0407;

import java.util.Arrays;

public class SortChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name ="Shah Mammadov";
		char [] nameCharacters = name.toCharArray();
		Arrays.sort(nameCharacters);
		
		System.out.println(Arrays.toString(nameCharacters));
		
		String[] name1 = {"a1999", "a2","afZ"};
		Arrays.sort(name1);
		System.out.println(Arrays.toString(name1));
		String[] names = {"abc","efg"," " , "123","Ku"} ; 
	    Arrays.sort(names);
	    System.out.println(Arrays.toString(names));
	    
	    // if multiple items have same first char 
	    // it will move on to compare the next character
	    String[] names2 = {"abc","afz","afZ"} ; 
	    Arrays.sort(names2);
	    System.out.println(Arrays.toString(names2));
		

	}

}
