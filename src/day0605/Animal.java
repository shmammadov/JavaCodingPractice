package day0605;

public abstract  class Animal {
	
	public abstract void MakeNoise();

}

abstract class Mammals extends Animal {
	
	public  void MakeNoise() {
		System.out.println("nihhaaa");
	}
	
	public abstract void eat(String foodName);
}

class Horse extends Mammals{
		
//	@Override
//	public void MakeNoise() {
//		// TODO Auto-generated method stub
//		
//	}


	@Override
	public void eat(String foodName) {
		// TODO Auto-generated method stub
		
	}

	
	
	
}