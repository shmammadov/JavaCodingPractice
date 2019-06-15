package day0605;

import com.sun.tools.javac.Main;

public class OnlineStudent implements Teachable {

	@Override
	public void canLearn() {
		// TODO Auto-generated method stub
		System.out.println("can learn by hardwork");
		
	}

	@Override
	public void doHomework() {
		// TODO Auto-generated method stub
		System.out.println("will do all homeworks"); 
		
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(Teachable.STUDY_HARD);
		OnlineStudent o =  new OnlineStudent();
		o.canLearn();
		o.doHomework();
	}

}
