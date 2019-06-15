package day0414;

public class TwoDArray3Way {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] [] data = {{2,14,3},{5,11} ,{9,8}};
//		for (int [] rows : data) {
//			
//			for ( int cells :rows ) {
//				System.out.print(cells + " ");
//			}
//			System.out.println();
//		}
		
		for (int i = 0; i < data.length; i++) {
			System.out.print("Row number " + (i+1));
			for (int j = 0; j < data[i].length; j++) {
				System.out.print(data[i][j] + " ");
				
			}
			System.out.println();
			
		}
		
		
		
	}

}
