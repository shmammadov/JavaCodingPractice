package day0511;

import java.util.ArrayList;

public class EmployeeActionForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		e1.name ="Alp";
		e1.age = 29;
		e1.title = "Teacher";
		e1.salary = 80000.90;
		e1.printAllInfo();
		Employee e2 = new Employee();
		e2.name ="Aslan";
		e2.age = 101;
		e2.title = "IT";
		e2.salary = 120000.75;
		e2.printAllInfo();
		
		Employee e3 = new Employee(); 
	    e3.name="mavlida";
	    e3.age=22;
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
		//myPeople.add(   new Employee ()  );
		
		
		for (int i = 0; i < myPeople.size(); i++) {
			//store each item -- Employee Object
			Employee each = myPeople.get(i);
			//calling method using this variable
			each.printAllInfo();
			
			
			//myPeople.get(i).printAllInfo();
	}	
		System.out.println("____________________________");

		
		String nameIt ="";
		int countSalary = 0;
		for (int i = 0; i < myPeople.size(); i++) {
			if(myPeople.get(i).salary>100000) {
				//countSalary++;
				myPeople.get(i).printAllInfo();
				
			}
						
		}
		
		System.out.println("____________");
		
		int youngOnes = 0;
		for (Employee eachEmp : myPeople) {
			if(eachEmp.age<25) {
				youngOnes++;
			}
		}
		
		System.out.println(youngOnes);
		//System.out.println(countSalary);
		
		System.out.println("_______________");
		String names="";
		
		for (int i = 0; i < myPeople.size(); i++) {
			Employee each = myPeople.get(i);
			if(each.age>25) {
				names+=each.name+",";
			}
			
		}
		System.out.println(names);
System.out.println("_______");
		//update salary if age more than 100
		for (int i = 0; i < myPeople.size(); i++) {
			Employee each = myPeople.get(i);
			if(each.age<100) {
				each.salary+=20000;
				each.printAllInfo();
			}
			
		}
		
		

}
}