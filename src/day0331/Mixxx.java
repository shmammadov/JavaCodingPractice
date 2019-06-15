package day0331;

public class Mixxx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mix = "Alodnos123ds";
		String storeNumbers = "";
		
		int i = 0;
		
		while (i<mix.length()) {
		char c = mix.charAt(i);

			if (c >='0' && c <='9') {
				
				System.out.println(c);
				storeNumbers+=c;
				
			}
			
			i++;

	}
		System.out.println(storeNumbers);
	}

}
