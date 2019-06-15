package day0413;

public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {1,2,8,6,9};
		for (int i = 0; i < nums.length; i++) {
			int eachItem = nums[i];
			System.out.println(eachItem);
		}
		
		System.out.println();
		
		for (int eachItem : nums) {
			System.out.println(eachItem);
		}
		

	}

}
