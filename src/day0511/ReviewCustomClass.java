package day0511;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReviewCustomClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
//		
//		List<Integer> nums2 = Arrays.asList(5,6,7,8,9);
//		ArrayList<Integer> nums3	= new ArrayList <>(nums2);
//		ArrayList<Integer> nums4	= new ArrayList <Integer>(Arrays.asList(5,6,7,8,9));
//		
		
		//nums.set(0, 1*2);
		
//		Integer item1 = nums.get(0);
//		nums.set(0, item1*2);
		
		nums.set(0, nums.get(0)*2);
		
		System.out.println(nums);
		Integer reverse = 0;
		for (int i = 0; i < nums.size(); i++) {
			nums.set(i, nums.get(i)*2);
		}
		
		System.out.println(nums);
		//reverse
		Collections.reverse(nums);
		
		System.out.println(nums);
		
		
	}

}
