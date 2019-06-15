package day0519;

public class Course {
	public static String school;
	public static boolean isRamadan;
	
	//static initializer block
	//System.out.println("Welcome  to " +school); cannot write any statement out side of block
	//it's used to initialize the static fields value before the type- 
	//-first usage and it will run ONLY ONE time
	
	public Course() {
	    System.out.println("Constructor");
	  }
	  // static initializer block 
	  // It will only run once when the class is loaded 
	  // iT'S used to initialize the static fields value before 
	  // the type's first usage 
	  // and it will run only one time right before it's usage
	  
	  // if you have more than one block 
	  // it will run in the order it appears
	static {
		school = "Cyber School";
		isRamadan = true;
		System.out.println("Welcome  to " +school);
		System.out.println("Let the journet begin");
	}
	static {
		if(isRamadan) {
			System.out.println("it's ramadan schedule");
		}else {
			System.out.println("we follow regular schedule");
		}
//		
		

	}
	
	//int couseId;
	
	public static void main(String[] args) {
		//System.out.println(school);
		//System.out.println(coudeId);cannot acces instance field/var from static method
	}
}
