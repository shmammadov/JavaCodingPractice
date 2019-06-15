package day0608;

public class IcedCoffe implements Drinkable{
	int size;
	
	public IcedCoffe(int size) {
		this.size = size;
	}
	
	@Override
	public void drink() {
		// TODO Auto-generated method stub
		System.out.println("drinking");
		
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("eat your drinkables");
		
	}

	@Override
	public String toString() {
		return "IcedCoffe [size=" + size + "]";
	}
	
	

}
