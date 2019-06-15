package day0407;

public class ArrayInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,4,6,8,9};
		nums[2] = nums[2]*2;
		
		nums[3]= nums[0]+nums[1];
		//swaping numbers
		int tempnum = nums[0];
		nums[0] = nums[nums.length-1];;
		nums[nums.length-1] = tempnum;
		
		for (int i = 0; i < nums.length;i++) {
			System.out.print(nums[i]+" 	");
		}
		System.out.println();
		int sum = 0;
		
		for (int i = 0; i < nums.length;i++) {
			sum = sum + nums[i];
			}	
System.out.println("total: "+sum);
	}

}
