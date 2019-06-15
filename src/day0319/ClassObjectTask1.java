package day0319;

import java.util.Scanner;

public class ClassObjectTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String name1, name2;
		System.out.println("type two names");
		name1 = input.next();
		name2 = input.next();
		boolean compareNames = name1.equalsIgnoreCase(name2);
		
		System.out.println("name1 matches name2:" + compareNames);
		
		int count1= name1.length();
		int count2= name2.length();
		
		System.out.println((count1>count2)?name1.charAt(1):name2.charAt(2));
		
		int lastIndex = count1-1;
		char lastChar = name1.charAt(lastIndex);
		
	}	

}
