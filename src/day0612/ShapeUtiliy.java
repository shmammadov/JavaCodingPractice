package day0612;

import day0609.Dog;

public class ShapeUtiliy {

	public static void main(String[] args) {
	    
	    
	    
	    describeTheShape(  new Triangle("Red",12, 10));

	    
	    Shape s1 = new Triangle("Red",12, 10); 
	    describeTheShape(  s1  );
	    
	    describeTheShape( new Square("blue", 5));
	    
	    
	    // something rediculous but focus on concept itself 
	    describeTheShape( new Dog() );
	    	    
	    
	   Shape myShape = getAnyShape();
	    myShape.draw();
	    
	    Drawable myDrawable = getAnyDrawable();
	    myDrawable.drawLine(3);
	    
	    
	  }
	
	public static Drawable getAnyDrawable() {
		Drawable d1 = new Triangle ("black",45,90);
		return d1;
		//or return new Triangle ("black",45,90);
		
	}
	
	public  static Shape getAnyShape() {
		Shape s1 = new Square ("red",25);
		return s1;
		//or you can do it at once new Square("blue",15)'
	}
	
	
	  // we dont want to create object while calling this 
	  // utlity method so we just made it static 
	  public static void describeTheShape(Shape anyShape) {  
	    
	    System.out.println("calling describeTheShape(Shape anyShape)");
	    anyShape.draw();

	  }
	  // create another method that accept Triangle object only 
	  
	  
	  public static void describeTheShape(Triangle anyTriangle) {  
	    System.out.println("calling describeTheShape(Triangle anyTriangle)");
	    anyTriangle.draw();
	  }
	  
	  // do not get fooled by the name 
	  // it accept any type of Object 
	  public static void describeTheShape(Object anyObject) {  
	    System.out.println("calling describeTheShape(Object anyObject))");
//	    anyObject.draw();
//	    anyObject.makeNoise(); 
	  }

}
