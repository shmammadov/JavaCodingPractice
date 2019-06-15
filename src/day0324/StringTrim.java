package day0324;

public class StringTrim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                  //index0123456789012345678
		String str = "   GOO    JAVA SPARTAN      ";
		System.out.println(str);
		
		String strTrimmed = str.trim();

		System.out.println(strTrimmed);
		
		int lastSpace = strTrimmed.lastIndexOf(" ");
		int count = strTrimmed.length();
		System.out.println(lastSpace);
		System.out.println(count);
		
		String lastWord = str.substring(lastSpace+1);
		System.out.println(str.substring(lastSpace+1));
		
//		int indexOfO =str.lastIndexOf("O");
//		String part = str.substring(indexOfO +1).trim();
//		String partTrim = part.trim();
//		
//		System.out.println(partTrim);
//
//		System.out.println(part);
	}

}
