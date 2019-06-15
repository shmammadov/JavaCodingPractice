package day0609;

public class AnimalShow4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal myAnimal = new Dog();
		myAnimal.makeNoise();
		
		//this is creating object without storing address of the object, using it once
		
		//this object is not accessible after this line w
		new Dog().makeNoise();
		myAnimal = new Horse();
		myAnimal.makeNoise();
		Dog d1 = new Dog ();

	}

}
