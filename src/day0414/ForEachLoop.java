package day0414;

import java.util.Arrays;

public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		int j = i;
		j = 20;
		
		System.out.println(i);
		int [] arr = {1,3,2,4,5};
		for (int k = 0; k < arr.length; k++) {
			int eachItem = arr[k];
			eachItem = 20;
		}
		System.out.println(Arrays.toString(arr));
	}

}
