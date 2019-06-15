package day0413;

public class WarmpUps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Saturday WARM UP Tasks : 

//			//Task1 : 
//				create an array of int with 5 items , return true if all items are more than 10
//				return false if not
//
//			
//
//			// Optional : Reverse each word in sentence
//			your output should be 
//			ketrebyC hctaB natrapS si tsom gnikrowdrah hctaB reve 
			boolean result = true;
			int[] nums = {15,41,11,55,25};
			for (int i = 0; i < nums.length; i++) {
				
				if(nums[i]<=10) {
					result = false;
					break;
				}
				
				
//				if (nums[i] > 10) {
//					System.out.println("ture");
//				}else {System.out.println("false");};
				
			}
			System.out.println(result);
	
			

	}

}
