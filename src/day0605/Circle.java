package day0605;

public class Circle extends Shape {
	
double radius;

 public void calculatePerimeter() {
	 double c = 2*Math.PI*radius; //math.pi 3.14
	System.out.println(c);
}
 public double calculateArea() {
	double area = 3.14*(3.14*radius);
	return area;
}

public Circle(String color, double radius) {
	super(color);
	this.radius = radius;
	
}
@Override
public String toString() {
	return "Circle [radius=" + radius + ", color=" + color + "]";
}



 





}
