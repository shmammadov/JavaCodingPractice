package day0501;

import java.util.ArrayList;

public class ArrayRemoving {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> listOne = new ArrayList<>();
		listOne.add(1);
		listOne.add(2);
		listOne.add(3);
		listOne.add(4);
		
		listOne.remove(2);
		//listOne.remove(new Integer(2));
		listOne.remove(Integer.valueOf(2));
		
		System.out.println(listOne);

	}

}
