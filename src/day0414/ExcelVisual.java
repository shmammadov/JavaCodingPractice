package day0414;

public class ExcelVisual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] data = { { 2, 14, 3 }, { 5, 11 }, { 9, 8 } };

		for (int i = 0; i < data.length; i++) {
			// skip the 2nd row
//			if (i==1) {
//				continue;
//				}

//			if (i == 1) {
//				break;
//			}

			System.out.print("Row number " + (i + 1));

			for (int j = 0; j < data[i].length; j++) {
				if(data[i][j]==4) {
					continue;
				}
				System.out.print(data[i][j] + " ");

			}

		}
		System.out.println();

	}

}
