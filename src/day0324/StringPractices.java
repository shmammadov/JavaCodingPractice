package day0324;

public class StringPractices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1st way string literal
		String str ="Sunday is Java Day";
		// 2nd way
		//String str = new String("Suday is Java Day");
		
		String up = str.toUpperCase();
		System.out.println(up);
		int count = str.length();
		char last = str.charAt(count-1);
		char blast = str.charAt(count-2);
		//using cartAt
		
		System.out.println("last two char ar: "+ blast + last);
		System.out.println(str.substring(count-2,count));
		System.out.println(str.substring(count-2));
		int positionOfIs = str.indexOf("is");
		
		System.out.println(positionOfIs);
		
		//does it start with Sunday
		
		//boolean startWith = str.equals("Sunday").indexOf("S")==0;
		
		//contains the word Java
		
		System.out.println(str.contains("Java"));
		
		System.out.println(str.indexOf("Java")>-1);
		
		
		
		
		
		
		
		
		
		
		//find the 3rd word
		
		int indexOfFirsSpace = str.indexOf(" ");
		System.out.println(indexOfFirsSpace);
		
		String word2 = str.substring(indexOfFirsSpace+1, indexOfFirsSpace+3);
		
		System.out.println(word2);
		
		int iOfSecondSpace = str.indexOf(" ", 7);
		System.out.println(iOfSecondSpace);
		
		String word3 = str.substring(iOfSecondSpace+1, iOfSecondSpace+5);
		System.out.println(word3);
				
				
		
		
		
		
		
		
		

	}

}
