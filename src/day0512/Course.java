package day0512;

public class Course {
		String name;
		int courseID;
		public Course() {
			this.name = "unknown";
			this.courseID = 101;
		}
		public Course (String name) {
			this.name = name;
			
		}
		public Course (int id) {
			this.courseID = id;
		}
		public Course (String name, int id) {
			this.name  = name;
			this.courseID = id;
		}
}
