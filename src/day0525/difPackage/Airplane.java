package day0525.difPackage;

import day0525.Vehicle;

public class Airplane extends Vehicle{
	
	

	private int wingCount; 
	
	public static void main(String[] args) {
		Airplane a1 = new Airplane("Boing", "392", 2020, 4);
		System.out.println(a1);
		System.out.println(a1.year);
		Vehicle v1 = new Vehicle ("Bored","725",2);
		System.out.println(v1.toString());
	}
	
	public Airplane(String brand,String model,int year,int wingCount) {
		super(brand,model,year);
		this.wingCount = wingCount;
//		setBrand(brand);
//		this.setModel(model);
	}
	  

	public int getWingCount() {
		return wingCount;
	}

	public void setWingCount(int wingCount) {
		this.wingCount = wingCount;
	}


	@Override
	public String toString() {
		return "Airplane [wingCount=" + wingCount 
				+ ", year=" + year 
				+ ", brand=" + getBrand() 
				+ ", model="+ getModel() + "]";
	}
	
	
	
	
	
	
	

}
