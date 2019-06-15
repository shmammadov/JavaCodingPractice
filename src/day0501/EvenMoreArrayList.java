package day0501;

import java.util.ArrayList;

public class EvenMoreArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numList = new ArrayList<>();
		numList.add(120);
		numList.add(435);
		numList.add(96);
		numList.add(49);
		numList.add(323);
		System.out.println(numList);
		numList.add(1,250);
		//numList.set(1,500);
		System.out.println(numList);
		
		
		//remove
		
		numList.remove(0);
		System.out.println(numList);
		//numList.clear();
		//System.out.println(numList);
		
		//check wheter and item exists in
		
		//contains
		System.out.println(numList.contains(250));
		System.out.println(numList.contains(233));
		
		//finding out the index/location
		
		int findTheIndex = numList.indexOf(96);
		
		System.out.println(findTheIndex);
		
		boolean isitEmptyOrNot =  numList.isEmpty();
		System.out.println(isitEmptyOrNot);
		
		
		//remove the second item
		numList.remove(new Integer (323));
		// or numList.remove(Integer.valueOf(435));
		System.out.println(numList);

		

		
		

	}

}
