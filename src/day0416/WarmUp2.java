package day0416;

public class WarmUp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] pizza = { { "mushroom", "black olive", "red avocado" }, { "spinach", "green pepper", "mushroom" },
				{ "black olives", "black olive", "spinach" }, { "mushroom", "green", "red pepper" },
				{ "banana pepper", "spinach", "red pepper" }, { "mushroom", "green avocado", "green cola" },
				{ "spinach", "green pepper", "mushroom" } };
		
		fatma:
		for (int i = 0; i < pizza.length; i++) {

			System.out.println("Slice number: " + (i + 1));
			
			for (int j = 0; j < pizza[i].length; j++) {
				if (pizza[i][j].equals("banana pepper")) {
					break fatma;

				}
				System.out.print(pizza[i][j] + " | ");
			}
			System.out.println();
		}
		System.out.println("______________________________________________________");
		fatma:
			for (int i = 0; i < pizza.length; i++) {

				System.out.println("Slice number: " + (i + 1));
				
				for (int j = 0; j < pizza[i].length; j++) {
					if (pizza[i][j].equals("banana pepper")) {
						continue;

					}
					System.out.print(pizza[i][j] + " | ");
				}
				System.out.println();
			}

	}

}
