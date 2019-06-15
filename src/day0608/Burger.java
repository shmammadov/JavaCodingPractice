package day0608;

public class Burger implements Edible {
	
	String name;
	int size;
	public Burger(String name, int size) {
		
		this.name = name;
		this.size = size;
	}
	
	
	@Override
	public String toString() {
		return "Burger [name=" + name + ", size=" + size + "]";
	}


	


	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("eat as much as you can");
		
	}
	
	public static void main(String[] args) {
		
		Burger b1 = new Burger ("Cheese",2);
		b1.eat();
		
		IcedCoffe c1 = new IcedCoffe(5);
		c1.eat();
		c1.drink();
		
		
		
	}
	
	

}
