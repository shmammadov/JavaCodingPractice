package day0430;

import java.util.ArrayList;

public class ArrayListwithType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numList = new ArrayList<>();
		Integer i =100;
		numList.add(i);
		numList.add(200);
		numList.add(300);
		
		
		System.out.println(numList);
		//get(index) get item from ArrayList
		Integer firtsItem = numList.get(0);
		int secondItem = numList.get(1);
		
		System.out.println(numList);
		System.out.println(firtsItem);
		System.out.println(secondItem);
		System.out.println(numList.get(2));
	}

}
