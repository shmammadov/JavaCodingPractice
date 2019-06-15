package day0324;

public class StringSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Ahmad Omar Al Alousi";
		
		System.out.println(str.indexOf("A"));
		
		System.out.println(str.indexOf("A",1));
		System.out.println(str.indexOf("A",11));
		
		
		int space1 = str.indexOf(" ");
		int space2 = str.indexOf(" ", space1+1);
		int space3 = str.indexOf(" ", space2+1);
		
		String word2 = str.substring(space1+1,space2);
		System.out.println(word2);
		
		System.out.println(str.indexOf(" "));
	System.out.println(str.indexOf(" ",6));
	System.out.println(str.substring(6,11));
		
	}

}
