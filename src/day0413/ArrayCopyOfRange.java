package day0413;

import java.util.Arrays;

public class ArrayCopyOfRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] heros = {"Ali","Hamza","Salahaddin","Halid"};
		String [] copyRange13 = Arrays.copyOfRange(heros,1,3);
		System.out.println(Arrays.toString(copyRange13));
		
		String [] copyRange34 = Arrays.copyOfRange(heros,2,4);
		System.out.println(Arrays.toString(copyRange34));
		
		String [] copyRange210 = Arrays.copyOfRange(heros,1,10);
		System.out.println(Arrays.toString(copyRange210));
		
	}

}
