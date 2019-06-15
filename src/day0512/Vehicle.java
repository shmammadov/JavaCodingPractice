package day0512;

public class Vehicle {

	private String model;
	private String make;
	private int speed;
	
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public 	void increaseSpeed (int increaseBy) {
		 //speed +=increaseBy;
		 for (int i = 1; i <= increaseBy; i++) {
				speed++;
				System.out.print(speed+"  ");

		 }
		 System.out.println();
	}
	public 	void decreaseSpeed (int decreaseBy) {
		 //speed +=increaseBy;
		 for (int i = 1; i <= decreaseBy; i++) {
				speed--;
				System.out.print(speed+"  ");

		 }
		 System.out.println();
	}
	
	public void stop() {
//		speed = 0;//direct way
//		this.speed = 0;//using this keyword
//		setSpeed(0);
		this.setSpeed(0);
	}
	

}
