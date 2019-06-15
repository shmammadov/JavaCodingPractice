package day0410;

import java.util.Arrays;

public class Task6Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String shows = "Orville, Game of Thrones, X-man, Gifted, Breaking Bad";
		String[] showsArray = shows.split(",");
		System.out.println(Arrays.toString(showsArray));
//		for (int i = 0; i < showsArray.length; i++) {
//			System.out.println(showsArray[i]);
//		}
		
		String[] showsArray2 = shows.split("Game of Thrones");
		
		for (int i = 0; i<showsArray2.length;i++) {
			System.out.println(showsArray2[i]);
		}
//		for (int i = 1; i < 100; i++) {
//			System.out.println("to get the last item use length-1");
//		}
	}

}
