package day0427;

public class ArrayTwoDPrinter {
	public static void twoDPrinter(int [] [] twoArr) {
//		
		for (int i = 0; i < twoArr.length; i++) {
			for (int j = 0; j < twoArr[i].length; j++) {
				System.out.print(twoArr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub  
		int [] [] twoArr = { {2,3,5}, {11,5,6}    };
		
		twoDPrinter(twoArr);
}
}