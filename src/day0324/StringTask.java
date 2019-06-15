package day0324;

import java.util.Scanner;

public class StringTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter your name");
		
		String name = scan.next();
		
		boolean a = name.startsWith("A");
		boolean x = name.endsWith("x");
		int count = name.length();
		boolean evenNumber = count%2==0;
		boolean oddNumber = count%2==1;
		
		if (a && x) {
			System.out.println("True");
			
		}else {
			System.out.println("false");
		}
		
		
		System.out.println(name.lastIndexOf("a"));
		
		if (evenNumber) {
			int midIndex = count/2;
			System.out.println(name.charAt(midIndex));
		}else if(oddNumber) {
			int midIndex = count/2;
			char midL = name.charAt(midIndex);
			char midR = name.charAt(midIndex-1);
			System.out.println(midL+""+midR);
		}
			

	}

	//private static char[] name.lastindexOf(String string) {
		// TODO Auto-generated method stub
		//return null;
	}

