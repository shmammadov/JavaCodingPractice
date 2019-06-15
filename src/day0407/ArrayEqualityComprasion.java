package day0407;

import java.util.Arrays;

public class ArrayEqualityComprasion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1 = {2,1,44,3,54};
		int [] arr2 = {1,2,44,3,54};
		int [] arr3 = {1,3,44,2,54};
		System.out.println(arr1==arr2);
		System.out.println(Arrays.equals(arr1, arr2));
		System.out.println(Arrays.equals(arr2, arr3));
		Arrays.sort(arr2);
		Arrays.sort(arr3);
		System.out.println(Arrays.equals(arr2, arr3));
	}

}
