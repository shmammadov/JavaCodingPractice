package day0320;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String fname = "Shahriyar";
//		char secondChar = fname.charAt(2); 
//		System.out.println(fname.length());
//		System.out.println(fname.toUpperCase());
//		System.out.println(fname.toLowerCase());
//		System.out.println(secondChar);
//		
		// last character is always one less than length 
		// int lastIndex = fname.length()-1 ; 
		//System.out.println(fname.charAt(lastIndex));
//		System.out.println(fname.charAt(fname.length()-1));
//		
//		// contains 
//		String name = "Alpaslan";
//		System.out.println(name.contains("asl"));
//		
//		
//		//indexOf ->return the index of first character, if you have more it will give you
//		System.out.println(name.indexOf("L"));
//		String upName = name.toUpperCase();
//		System.out.println(upName.indexOf("L"));
//		
//		//also
//		System.out.println(name.toUpperCase().indexOf("N"));
//		
//		//substring
//		//01234567
//		//alpaslan
//		System.out.println(name.substring(0,8));
		String name = "Shahriyar";
		System.out.println(name.charAt(8));
		System.out.println((name.substring(0,2)));
		System.out.println((name.substring(0,2)));  
		int count = name.length();
		System.out.println(name.substring(count-2,count));
		int midPoint = count/2;
		
		System.out.println(name.substring(midPoint,count));
		
		
		
		
	}

}
