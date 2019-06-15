package day0519;

//static import: is used to import the visible static members of another class
// we can use .* to import all static members
import static day0519.StudentUtility.*;
public class StudentActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentUtility.displayAllStudent();
		StudentUtility.addOneStudent("John Doe");
		StudentUtility.addOneStudent("Jecky John");
		displayAllStudent();
		System.out.println("_________");
		
		updateStudent(2,"Melisa");
		displayAllStudent();
		System.out.println("_________");
		
		removeStudent(5);
		displayAllStudent();
		System.out.println("_________");
		
		resetList();
		displayAllStudent();
		
		
	}

	private static void displayAllStudent() {
		// TODO Auto-generated method stub
		
	}

}
