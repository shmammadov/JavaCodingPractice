
package day0407;

import java.util.Arrays;
import java.util.Random;

public class RandomArrayValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int[] nums = new int [10];
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = rand.nextInt(100);
		}
		System.out.println(Arrays.toString(nums));
	}

}
