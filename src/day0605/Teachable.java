package day0605;
// as if java 7
// interface can only have CONSTANT and abstract method
public interface Teachable {
	  // as of java 7 
	  // interface can only have CONSTANT and abstract method 
	  
	  public static final boolean STUDY_HARD = true; 
	  // any field you have AUTOMATICALLY PUBLIC STATIC FINAL 
	  String SCHOOL = "CyberTek"; 
	  
	  // any method without body or access modifier 
	  // it's automatically public and abstract
	  void canLearn(); 
	  
	  public abstract void doHomework(); 

}
