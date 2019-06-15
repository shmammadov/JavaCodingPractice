package day0409;

public class CourseID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] courses = {
				"Welcome Kit",
				"Online-Java Programming",
		    	"Online-Software Development Lifecycle",
		    	"Online-Software QA Testing",
		    	"Online-Team Activity",
		    	"Online-Mentoring", 
		    	"Online-Selenium",
		    	"Online-SQL",
		    	"Online-API Testing"
				} ;
	int[] courseId = {143,166,168,170,163,203,169,171,164} ; 
	
//	for (int i = 0; i < courses.length; i++) {
//		System.out.println(courses[i] +" is "+courseId[i]);
//		
//	}
		
	//find the id of online java programming
	
	for (int i = 0; i < courses.length;i++) {
		String eachCourse = courses[i];
		//System.out.println(eachCourse);
		if(eachCourse.contentEquals("Online-Java Programming")) {
			System.out.println("index is " + courseId[i]);
			break;
		}
	}
	
	// find course id match 203
	for (int i = 0; i < courses.length; i++) {
					if(courseId[i]==203) {
			
			System.out.println(courses[i]);
		}
	}
	
	int count = 0;
	for (int i = 0; i < courses.length; i++) {
						if(courses[i].contains("Software")) {
				count++;
				
			}
						
	

	}
	System.out.println("count of software is "+ count);
		}
	}


