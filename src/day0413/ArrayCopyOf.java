package day0413;

import java.util.Arrays;

public class ArrayCopyOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] heros = {"Ali","Hamza","Salahaddin","Halid"};
		
		String [] copyOf2 = Arrays.copyOf(heros, 2);
		System.out.println(Arrays.toString(copyOf2));
		
		String [] copyOf4 = Arrays.copyOf(heros, 4);
		System.out.println(Arrays.toString(copyOf4));
		
		String [] copyOf0 = Arrays.copyOf(heros, 0);
		System.out.println(Arrays.toString(copyOf0));
		
		String [] copyOf10 = Arrays.copyOf(heros, 10);
		System.out.println(Arrays.toString(copyOf10));

	}

}
