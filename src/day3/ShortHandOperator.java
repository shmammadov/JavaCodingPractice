package day3;

public class ShortHandOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		System.out.println("the score is" + a);
		
		
		// a = a + 2
		a+=2;
		System.out.println(a);
				
		
		
		int k = 10;
		
		k -= 1; // k = k - 1;
		
		System.out.println(k);
		
		k/= 2; // k = k/2
		System.out.println(k);
		
		int j = 10;
		j = j + 2;
		j += 2;
		j++; // ++j;
		System.out.println(j);
		int c = 10;
		c++;
		System.out.println("c++ is " + c);
		int d = 10;
		++d;
		System.out.println("s++ is " + d);
		
	}

}
