package day0511;

import java.util.*;

public class ReverseArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums2 = Arrays.asList(5,6,7,8,9);
		ArrayList<Integer> nums3 = new ArrayList<>();
		
		System.out.println(nums2);
		//1st way
		Collections.reverse(nums2);
		System.out.println(nums2);
		//2nd way
		for (int i = nums2.size()-1; i >=0; i--) {
			//System.out.print(nums2.get(i));
			nums3.add(nums2.get(i));
			
		}
		System.out.println(nums3);
		
	}

}
