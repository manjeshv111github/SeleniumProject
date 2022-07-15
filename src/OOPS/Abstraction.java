package OOPS;

//Data hiding
// we can show only the necessary info and can hide unnecessary data 
// which contains only signature but not having body

// in abstarct class we can create both normal and abstract methods
// we cannot create object for the abstract class , object can be created for the abstract class when it inherited from the other class using extends keyword
// when you calling abstract method from the abstract class , we should define or create body for the abstract methods

//Abstract class
abstract class Animal {
// Abstract method (does not have a body)
	public abstract void animalSound();

// Regular method
	public void sleep() {
		System.out.println("normal method inside abstract class");
	}
}

//Subclass (inherit from Animal)
class Pig extends Animal {
	public void animalSound() {
		// The body of animalSound() is provided here
		System.out.println("Abstract method inside normal class");
	}
}

class Abstraction {
	public static void main(String[] args) {
		Pig myPig = new Pig(); // Create a Pig object
		myPig.animalSound();
		myPig.sleep();
	}
}
