package day0518;

public class HouseBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CyberHouse h1 = new CyberHouse(12,"Victorian");
		CyberHouse h2 = new CyberHouse(14,"Villa");
		h1.houseNum = 10;
		
		CyberHouse.streetName = "Eagles Claw";
		
		
		System.out.println(CyberHouse.streetName);
		
		System.out.println(h1.streetName);
		System.out.println(h1);
		
		
		
		
	}

}
