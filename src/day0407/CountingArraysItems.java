package day0407;

public class CountingArraysItems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 122, 3, 101, 6 };
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 100) {
				count ++;
				

			}

		}
		System.out.println(count);

	}

}
