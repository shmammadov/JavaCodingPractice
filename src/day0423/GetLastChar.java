package day0423;

public class GetLastChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getLastChar("Alpaslan")+""+getLastChar("Alpaslan"));
		
		
		printSomething();
	}
	public static char getLastChar(String word) {
		char last = word.charAt(word.length()-1);
		//System.out.println(last);
		return last;
	}
	
	public static void printSomething() {
		
		System.out.println("Hold your hourses");
		
	}
}
