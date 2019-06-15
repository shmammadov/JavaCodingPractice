package day0323;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//byte --> int upcasting/type widening
		//this happens implicitly = by computer
		
		
		byte b = 12;
		int i = b;
		int y = (int)b; //explicitly -- by programner
		
		int x = 10;
		byte a = (byte) x;
		
		double d = 12.22;
		int f  = (int) d;
		
		String name = "Shahriyar";
		
				char fChar = name.charAt(0);
		
				char lChar = name.charAt(name.length()-1);
				
				int intToFChar = fChar;
				int intToLChar = lChar;
				
				System.out.println(intToFChar +" "+ intToLChar);
		
				
				
				char charZero = '0';
				int zeroToInt = charZero;
				System.out.println(zeroToInt);
				char bb = 'B';
				System.out.println((int)bb);
				
				System.out.println(fChar+lChar);
				System.out.println("" + fChar+lChar);

				System.out.println("the sum of ascii f and last is " + (fChar+lChar));
	}

}
