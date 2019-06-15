package day0410;

import java.util.Arrays;

public class Task5Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Task num 5 
		// create a string called groceries 
		// add items separated by comma 
		// split them and print them out 
		/// find out size of split 
		/// find out length of each items 

		String groceries = "onions,tomatoes,cucumber,eggplant,potato,eggs,milk";
		String[] words = groceries.split(",");
		
		System.out.println(Arrays.toString(words));
		System.out.println(words.length);
		
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i] + " has "+ words[i].length()+" characters");
		}
		
	}

}
