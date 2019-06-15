package day0423;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long firstYear = giveMe6DigitSalary();
		long secondYear = (firstYear*10/100)+firstYear;
		System.out.println(secondYear);
		
		System.out.println(giveMe6DigitSalary());
	}
	public static long giveMe6DigitSalary() {
		
		return 18000L;
		
	};
	

}
