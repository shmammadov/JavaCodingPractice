package day0601;

public class FinalStaticFields {
	//public static final field -> CONSTANT
	public static final String RACE2 ="HUMAN";
	public static final String RACE = assignValue();
	
	public static final int MAX_SPEED;
	
	static {
		MAX_SPEED = 180;
	}
	public static String assignValue() {
		return "Insan";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(RACE);
		System.out.println(MAX_SPEED);
		//cannot reassigne a new value
		//RACE = "Spartanoid";
		
	}

}
