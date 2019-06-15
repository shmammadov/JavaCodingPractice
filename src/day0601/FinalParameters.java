package day0601;

public class FinalParameters {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printItems("ABC");
	}
	
	public static void printItems	(final String item) {
		
		//item = "some value";
		System.out.println("the item is "+ item);
	}

}
