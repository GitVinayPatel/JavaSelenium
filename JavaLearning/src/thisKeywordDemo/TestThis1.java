package thisKeywordDemo;

//this: to refer current class instance variable

public class TestThis1 {
	
	int a=10;
	
	void method()
	{
		int a = 20;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(this);
	}
	
	public static void main (String [] args)
	{
		TestThis1 obj1 = new TestThis1();
		obj1.method();
		
	}

}
