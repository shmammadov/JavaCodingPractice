package day0501;

import java.util.ArrayList;

public class ArrayListDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Double> priceList = new ArrayList<>();
		priceList.add(11.3);
		priceList.add(43.5);
		priceList.add(9.6);
		priceList.add(4.9);
		priceList.add(32.3);
		
		System.out.println("item 3 : " + priceList.get(2));
        System.out.println("----------");
        double sum = 0;
        
        for (Double each : priceList) {
            System.out.println(each);
            sum+=each;
            
        }
        System.out.println("sum of each item is: "+ sum);
        System.out.println("----------");
        for (int i = 0; i < priceList.size(); i++) {
            if (priceList.get(i) > 10) {
                System.out.println(priceList.get(i));
            }
        }
        
	}
}
