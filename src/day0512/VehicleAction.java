package day0512;

public class VehicleAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle car1 = new Vehicle();
		car1.setMake("Infiniti");
		car1.setModel("FX35");
		car1.setSpeed(80);
		
		System.out.println(car1.getMake());
		System.out.println(car1.getModel());
		System.out.println(car1.getSpeed());
		
		car1.stop();
		car1.increaseSpeed(9);
		
		//System.out.println(car1.getSpeed());
		
		car1.decreaseSpeed(5);
		
		System.out.println(car1.getSpeed());
		
		Vehicle car2 = new Vehicle();
		car2.setMake("Mercedes");
		car2.setModel("G");
		car2.setSpeed(500);

		
	}

}
