package day0518;

public class StaticMemberAccessLevel {

	static int staticVar;
	int instanceVar;
	int num3;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(++staticVar);
//		
		int num2;
		num2 = 0;
		System.out.println(num2++);
		// we can not access any instance member in static method
//		System.out.println(num3);
		StaticMemberAccessLevel s1 = new StaticMemberAccessLevel();
		System.out.println("value of instance filed is " + s1.instanceVar);
		//System.out.println("value of instance filed is " + s1.staticVar);
//		
      s1.doSomething();
		
	}
	// what can we access inside instance method?
	/*
	 * any instance field static field any instance method static method can be accessible
	 */
	public void doSomething() {
		System.out.println("inside instance method");
		System.out.println("inside instance method" + instanceVar);
		System.out.println("iside instance mehtod" + staticVar);
	}
	// what can we access inside instance method?
	// no object needed when we call this method
	
	//can access ONLY STATIC methods
	public static void doSomethingStatic() {
		System.out.println("inside instance method");
		//sSystem.out.println("inside instance method" + instanceVar);
		System.out.println("iside instance mehtod" + staticVar);
	}

}
