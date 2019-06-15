package javanotes;

import java.util.ArrayList;

public class ReviewArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numList = new ArrayList<>();
		numList.add(11);
		numList.add(22);
		numList.add(33);
		numList.add(44);
		numList.add(55);
		
		System.out.println(numList.get(1));
		
		numList.add(1,77);
		System.out.println(numList.get(1));
		System.out.println(numList);
		numList.set(0, 66);
		
		

		


		
	}

}
