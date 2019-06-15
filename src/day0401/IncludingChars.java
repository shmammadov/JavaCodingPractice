package day0401;

public class IncludingChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABCDEFABCT";
		int count = 0;
		int countOfChars = str.length();
		
		String target ="AB";		
		
		
		
		for (int i = 0; i<str.length()-target.length()+1;i++) {
		String twoChar =  str.substring(i,i+target.length());
		//System.out.println(twoChar);
		System.out.println(twoChar);
		if (twoChar.equals(target)) {
			count++;
		}

	}
		System.out.println(count);

		
		
		
//		for (int i = 0;i<str.length()-1;i++) {
//			String twoChar =  str.substring(i,i+2);
//			
//			System.out.println(twoChar);
//			if (twoChar.equals("BC")) {
//				count++;
//			}
//		}
		//System.out.println(count);

	}

}
