package day0519;
import static java.util.Arrays.sort;

import static day0519.Bike.*;
public class StaticArrayClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,8,10,44,5};
		sort(nums);
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		showCurrentCount();
		
	}

}
