package day0505.copy;

public class CreatCars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		car1.make = "honda";
		car1.model = "accord";
		car1.year = 2018;
		car1.price = 50000;
		car1.horsePower = 200;
		
		Car car2 = new Car();
		car2.make = "toyota";
		car2.model = "camry";
		car2.eat();
		System.out.println(car1.price);
		
		
		
		
	}

}
