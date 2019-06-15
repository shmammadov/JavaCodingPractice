package day0409;

public class MaxLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String movies[] = {"My","Life","Is","Better"};
		int max = movies[0].length();
		int indexNumber = 0;
		for (var i = 0; i < movies.length;i++) {
			
			if (movies[i].length()>max) {
				max = movies[i].length();
				indexNumber = i;
			}
			
		}
		System.out.println(movies[indexNumber]+" "+max);

	}

}
