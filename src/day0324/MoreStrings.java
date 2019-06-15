package day0324;

public class MoreStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//str.length()>0 ---> isEmpty();
		
		String str = "";
		System.out.println(str.isEmpty());
		
		String str2 = "abc";
		System.out.println(str2.isEmpty());
		
		String str3 = " ";
		System.out.println(str3.isEmpty());
		
		String actualResult = "Amazon.com " + "";
		
		String str4 = "Busra";
		
		System.out.println(str4.startsWith("B"));
		System.out.println(str4.startsWith("ABC"));
		
		boolean b = str4.startsWith("Bu");
		
		if(b) {
			System.out.println("yes it is true");
		}else {
			System.out.println("not it doesnt start Bu ");
		}
		
		

		

	}

}
