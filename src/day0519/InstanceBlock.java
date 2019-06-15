package day0519;

import java.util.Random;

public class InstanceBlock {
	


	int num;
	//instance block: a block that run every time an object is begin created 
	// is being created right before constructor class
	{
		System.out.println("initializing the launch");
		System.out.println("All System GO!!!");
		Random r = new Random ();
		num = r.nextInt();
		
		
	}
	
	
	
	public InstanceBlock() {
		System.out.println("Constractor");
	}
	
	public InstanceBlock(String name) {
		System.out.println("Constractor "+ name);
	}
	
	

}
