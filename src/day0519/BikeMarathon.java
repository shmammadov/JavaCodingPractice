package day0519;

import java.util.ArrayList;
import java.util.Arrays;

public class BikeMarathon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b1 = new Bike("Kawasaki", 4, 50);
		Bike b2 = new Bike("Ducati", 5, 30);
		Bike b3 = new Bike("Switch", 6, 60);
		Bike b4 = new Bike("BMW", 4, 45);

		ArrayList<Bike> allBikes = new ArrayList<>(Arrays.asList(b1, b2, b3, b4));
//		for (int i = 0; i < allBikes.size(); i++) {
//			System.out.println(allBikes.get(i));
//		}
		
		for(Bike each : allBikes) {
//			System.out.println(each);
//			System.out.println(each.getId()+ "____"+ each.getBrand());
			each.speedUp(10);
			System.out.println(each.toString());
		}
		 System.out.println("--------------------------");
		    Bike.showCurrentCount(); //-->> Bike count is 4 now
		    
		    Bike.resetCount();
		    Bike.showCurrentCount(); //-->> Bike count is 4 now
		    
		    Bike b5 = new Bike("Yamaha", 4, 88);
		    System.out.println("current id of b5 is " + b5.getId());
		    Bike b6 = new Bike("Harley-Davidson", 3, 70);  
		    System.out.println("current id of b6 is " + b6.getId());
		    Bike.showCurrentCount(); //-->> Bike count is 4 now

	}

}
