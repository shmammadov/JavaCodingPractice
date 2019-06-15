package day0512;

public class CourseAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course c1 = new Course();
		Course c2 = new Course("Java");
		System.out.println(c2.name +""+ c2.courseID);
		
		Course c3 = new Course(202);
		System.out.println(c3.courseID);
		
		Course c4 = new Course("CS", 123);
		System.out.println(c4.name +" "+ c4.courseID);
		
	}

}
