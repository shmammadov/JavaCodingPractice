package day0525;

public class ExtremeSport extends Sport {
	//this is optional annotation to make sure you have overriden the method 
	/*
	 * what we observed here
	 * same method
	 * same method parameter
	 * same return type
	 * same access modifier
	 * this method is in sub class
	 * this is a instance method
	 */
	@Override
	public void doSport() {
		
		System.out.println("doing extreme sport");
	}
	public String toString() {
		return "extreme sport";
	}
	
		public static void main(String[] args) {
			
			ExtremeSport e1 = new ExtremeSport();
			e1.doSport();
			System.out.println(e1.toString());
		}
}
