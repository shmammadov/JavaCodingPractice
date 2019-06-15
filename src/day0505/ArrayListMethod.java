package day0505;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lst = new ArrayList<>();
		lst.add("apple");
		lst.add("orange");
		lst.add("banana");
		
		printItems(lst);
		
		System.out.println(numAddToList(10));
	}
	
	public static ArrayList<Integer> numAddToList (int x){
		ArrayList<Integer> numList =  new ArrayList<>();
		for(int i = 1; i<x; i++) {
			numList.add(i);
		}
		
		return numList;
	}
	public static void printItems(List<String>strLst) {
		for (int i = 0;i<strLst.size();i++ ) {
			
			System.out.print(strLst.get(i)+" - ");
		}
		System.out.println();
}
}
