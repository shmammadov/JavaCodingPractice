package day0402;

public class Task33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum =0;
		for (int i = 0; i < 50; i++) {
			if (i%3==0 || i%5==0) {
				continue;
			}
			sum = sum + i;
			System.out.println(i);
		}
		System.out.println(sum);
	}

}
