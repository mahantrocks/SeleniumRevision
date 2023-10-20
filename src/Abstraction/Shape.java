package Abstraction;

public abstract class Shape {

	Shape(){
		
		System.out.println("Parent class constructor");
	}
	
	abstract void drawing();
	
	void fill () {
		System.out.println("This is a parent method implementation");
	}
}
