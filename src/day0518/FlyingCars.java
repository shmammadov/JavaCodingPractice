package day0518;

public class FlyingCars {
	//Singleton patterns:
	//a pattern to make sure single instance object during entire runtime of the program
	static FlyingCars fcar;
	
	private FlyingCars() {
		
	}
	
	public static FlyingCars getInstance() {
		FlyingCars f1 = new  FlyingCars();
		return f1;
	}

}
