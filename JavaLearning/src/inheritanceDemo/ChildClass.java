package inheritanceDemo;

public class ChildClass extends ParentClass {
	
	void ChildMethod1()
	{
		System.out.println("I am Method1 of Child class");
	}
	
	void ChildMethod2()
	{
		System.out.println("I am Method2 of Child class");
	}
	
	public static void main(String[] args)
	{
		ChildClass C = new ChildClass();
		
		C.PearntMethod1();
		C.ChildMethod1();
		
		
	}

}
