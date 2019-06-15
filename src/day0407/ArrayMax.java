package day0407;

public class ArrayMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,4,6,22,12};
		int max = nums[0];
		
		for (int i=1;i<nums.length;i++) {
			if (nums[i]>max) {
				max = nums[i];
			}
		}
		System.out.println(max);
	}

}
