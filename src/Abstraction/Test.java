package Abstraction;

public class Test extends Shape{
	
	Test(){
		System.out.println("Child Class constructor");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		//t.fill();
		//t.drawing();

	}

	@Override
	void drawing() {
		System.out.println("This is overriden child method implementation");
		
	}

}
