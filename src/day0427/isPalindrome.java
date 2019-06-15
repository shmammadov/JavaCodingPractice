package day0427;

public class isPalindrome {
//	public static String isPalindrome(String word) {
//		
//		for (int i = word.length()-1; i>0; i--) {
//			System.out.println(word.charAt(i));
//		}
//		
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "shah";
		String reversed ="";
		for (int i = word.length()-1; i>=0; i--) {
			reversed += word.charAt(i);
			
		}
		System.out.print(reversed);

		System.out.println();
		if (word.equals(reversed)) {
			System.out.println("it is Palindrom");
		}else {
			System.out.println("it is not Palindrom");
		}

	}

}
