package day0409;

import java.util.Arrays;

public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String movies[] = {"My","Life","Is","Better"};
		
		System.out.println(Arrays.toString(movies));
		System.out.println(movies[2]);
		System.out.println(movies.length);
		System.out.println(movies[3].length());
		
		for(int i = 0; i < movies.length;i++) {
			System.out.println(movies[i]+" has "+movies[i].length()+" characters");
		}

	}

}
