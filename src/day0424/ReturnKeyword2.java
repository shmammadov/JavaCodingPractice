package day0424;

public class ReturnKeyword2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ageTester(13);
		//ageTester(22);
		// Break vs Switch
		/* 
		 * break--> we can use it inside switch and loop
		 * 
		 * return--> exclusively used to return a value or te
		 * 
		 * 
		 * 
		 */
		//System.out.println(isAdultOrNot(11));
		System.out.println(isAdultOrNot(22));

		
		
	}
	public static boolean isAdultOrNot(int age) {
		if (age<18)	{
			System.out.println("not allowed");
			return false;
		}
		return true;
		
	}
	
	public static void ageTester(int age) {
		if (age<18)	{
			System.out.println("not allowed");
			return;
		}
		System.out.println("study hard");
		System.out.println("work hard");
		System.out.println("get your driver licenses");
	}

}
