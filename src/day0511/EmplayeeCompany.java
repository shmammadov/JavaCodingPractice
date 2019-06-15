package day0511;

import java.util.*;

public class EmplayeeCompany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		e1.name ="Alp";
		e1.age = 29;
		e1.title = "Teacher";
		e1.salary = 80000.90;
		e1.printAllInfo();
		Employee e2 = new Employee();
		e2.name ="Aslan";
		e2.age = 33;
		e2.title = "IT";
		e2.salary = 12000.75;
		e2.printAllInfo();
		
		Employee e3 = new Employee(); 
	    e3.name="mavlida";
	    e3.age=28;
	    e3.title="Senior QA";
	    e3.salary=100000;
	    e3.printAllInfo();
	    
	    Employee e4=new Employee();
	    e4.name="Enser";
	    e4.age=24;
	    e4.title="CEO";
	    e4.salary=3000000;
	    e4.printAllInfo();
		ArrayList<Employee> myPeople = new ArrayList<>();
		myPeople.add(e1);
		myPeople.add(e2);
		myPeople.add(e3);
		myPeople.add(e4);
		myPeople.add(   new Employee ()  );
		
		System.out.println(myPeople.size());
		
		Employee firstItem = myPeople.get(0);
		firstItem.printAllInfo();
		
		Employee fifthItem = myPeople.get(4);
		fifthItem.printAllInfo();
		
		for (int i = 0; i < myPeople.size(); i++) {
			//store each item -- Employee Object
			Employee each = myPeople.get(i);
			//calling method using this variable
			each.printAllInfo();
			
			
			//myPeople.get(i).printAllInfo();
		}
		
	
		
		
		
		
		
		
		
		
		
	} 

}
