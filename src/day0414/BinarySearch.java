package day0414;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//binary search searching index of certain item
		
		int[] nums = {-4,5,6,11,19,20,54};
		Arrays.sort(nums);
		
		int index = Arrays.binarySearch(nums,22);
		System.out.println(index);
		int index10 = Arrays.binarySearch(nums,21);
		System.out.println(index10);
		int index100 = Arrays.binarySearch(nums,-1);
		System.out.println(index100);
		
		
		
	}

}
