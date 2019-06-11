package constructorDemo;

public class MyChildClass extends MyParentClass {
	
	MyChildClass()
	{
		System.out.println("I am child class constructor");
	}

	public static void main(String[] args) {
		
		new MyChildClass();
		
		}

}
