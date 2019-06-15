package day0407;

public class CharArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char nameChar[] = {'f','a','t','m','a'};
		for (int i = 0; i<nameChar.length;i++) {
			System.out.print(nameChar[i]+" ");
		}
		System.out.println();
		int count = nameChar.length-1;
		int midChar = count/2;
		
		System.out.println();
		
		for(int i = count; i>=0; i--){
			System.out.print(nameChar[i]+" ");
		}
	}

}
