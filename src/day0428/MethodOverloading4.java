package day0428;

public class MethodOverloading4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		add(10);
		add(10L);

	}

	public static void add(int x) {

		System.out.println("int x" + x);
	}

	public static void add(long x) {

		System.out.println("long x" + x);
	}

}
