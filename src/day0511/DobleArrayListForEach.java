package day0511;

import java.util.ArrayList;
import java.util.Arrays;

public class DobleArrayListForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> nums4	= new ArrayList <Integer>(Arrays.asList(5,6,7,8,9));
		int i = 10;
		int j = i;
		j = 100;
		System.out.println(j);
		for (Integer each : nums4) {
			System.out.print(" Item : "+ each);
		}
		System.out.println();
		
		
		for (int x = 0 ; x<nums4.size();x++) {
			Integer each = nums4.get(x);
			System.out.print(" Item : "+each);
		}
	}

}
