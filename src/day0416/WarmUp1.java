package day0416;

import java.util.Arrays;

public class WarmUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] pizza = { { "mushroom", "black olive", "red avocado" }, { "spinach", "green pepper", "mushroom" },
				{ "black olives", "black olive", "spinach" }, { "mushroom", "green", "red pepper" },
				{ "banana pepper", "spinach", "red pepper" }, { "mushroom", "green avocado", "green cola" },
				{ "spinach", "green pepper", "mushroom" } };
		//Task1.2
		System.out.println(Arrays.deepToString(pizza));
		//Task1.2
		for (String[] slice : pizza) {
			for (String toppincs:slice) {
				System.out.print(toppincs+" ");
			}
			
			System.out.println();
			
		}
		System.out.println("___________________________________");
		
		for (int i = 0; i<pizza.length;i++) {
			
			System.out.println("Slice number: "+ (i+1));
			if (i==2) {
				continue;
			}
			for (int j = 0; j < pizza[i].length; j++) {
				System.out.print(pizza[i][j] + " | ");
			}
			System.out.println();
		}


	}

}
