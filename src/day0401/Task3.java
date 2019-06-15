package day0401;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABCDEFGHITP";
		
		for (int i = 0; i<str.length();i+=2) {
			if(i!=str.length()-1)
			System.out.print(str.substring(i,i+2)+" ");
			else {
				System.out.println(str.substring(i));
			}
		}
		System.out.println();
		//3 char
		for (int i = 0; i<str.length();i+=3) {
			if(i!=str.length()-2)
			System.out.print(str.substring(i,i+3)+" ");
			else {
				System.out.println(str.substring(i));
			}
		}

	}

}
