package day0430;

public class StringToPrimitive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "True";
		boolean b1 = Boolean.parseBoolean(str);
		boolean b2 = Boolean.parseBoolean("ABC");
		boolean b3 = Boolean.parseBoolean("TRUE");
		
		System.out.println(b1);
		System.out.println(b2);

		System.out.println(b3);


		

	}

}
