package day0427;

public class VarArgs2 {
	
	public static void printNames(String... names) {
//		
//		System.out.println(names[3]);
//		System.out.println(names[0]);
		System.out.println(names.length);
		


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNames("Yar","Alp","Aslan","Fatma");
		printNames();
	}

}
