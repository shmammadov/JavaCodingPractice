package day0428;

public class MethodOverloading5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// any literal non fractional will be int
		// any literal fraction will be double
//		double d;
//		d = 10F;
//		System.out.println(d);
		release(10d);
		release(10L);
		release(10F);
		release((short)10);

	}
	public static void release(double d) {
		System.out.println(d);
		
	}

}
