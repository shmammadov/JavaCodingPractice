package day0605;

abstract public class Shape {
	
	String color;
	
	abstract public void calculatePerimeter();
	abstract public double calculateArea();
	
	
	
	@Override
	abstract public String toString();
	public Shape(String color) {
		this.color = color;
	}
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("drawing ");
		
	}

}


