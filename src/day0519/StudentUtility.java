package day0519;

import java.util.ArrayList;

public class StudentUtility {
	private static ArrayList<String> studentList;
	
	static {
		System.out.println("Welcome to StudentUtility");
	}
	static {
		//load all my data
		loadallMyData();
		System.out.println("All students have been loaded");
	}
	
	public static void displayAllStudent() {
		for (int i = 0; i < studentList.size(); i++) {
			System.out.println(i+1 + ". "+ studentList.get(i));
			
		}
	}
	
	private static void loadallMyData() {
		studentList = new ArrayList<String>();
		studentList.add("Ali");
		studentList.add("Veli");
		studentList.add("Jack");
		studentList.add("Shah");
		studentList.add("Alp");
		
	}
	
	public static void addOneStudent(String name) {
		studentList.add(name);
	}
	
	public static void updateStudent (int index, String newName) {
		if(index>=studentList.size()) {
			System.out.println("OUT OF RANGE");
			return;
		}
		
		studentList.set(index, newName);
	}
	public static void removeStudent(int index) {
		if(index>=studentList.size()) {
			System.out.println("OUT OF RANGE");
			return;
		}
		studentList.remove(index);
		
	}
	
	public static void resetList() {
		studentList.clear();
	}
	
	
	public static void main(String[] args) {
		System.out.println(studentList);
		displayAllStudent();
		System.out.println("_____________________");
		addOneStudent("fatma");
		displayAllStudent();
		System.out.println("_____________________");
		updateStudent(15,"Deli");
		displayAllStudent();
		System.out.println("_____________________");
		removeStudent(3);
		displayAllStudent();
		System.out.println("_____________________");
		resetList();
		displayAllStudent();
		
			
		
	}
	

}
