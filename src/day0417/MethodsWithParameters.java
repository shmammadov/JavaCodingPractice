package day0417;

public class MethodsWithParameters {
	public static void printTheSum(double a, double b) {
		double sum = a+b;
		System.out.println(sum);
	}
	public static void reportName(String fName, String lName) {
		System.out.println(fName.length() +" "+lName.length());
		System.out.println(fName.charAt(0) +" "+fName.charAt(0));
		
		
	}
	
	public static void reverseString (String word) {
		for (int i = word.length()-1; i >= 0; i--) {
			System.out.print(word.charAt(i));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str = "abc";
//		System.out.println(str.substring(1,3));
		
		
		
		//printTheSum (10,20);
		//printTheSum(1.5,4.8);
		reverseString("yar");
		
	}

}
