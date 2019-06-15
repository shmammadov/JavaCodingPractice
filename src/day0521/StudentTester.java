package day0521;

public class StudentTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student ()	;
		s1.name ="alp";
		s1.age = 1;
		s1.gender = 'M';
		s1.height = 1.3;
		s1.studentId = 20192;
		
		System.out.println(s1.studentId);
		Person p1 = new Person();
		p1.name = "fatma";
		p1.age = 21;
		p1.gender = 'F';
		p1.height = 6.1;
		System.out.println(p1.height);
	}

}
