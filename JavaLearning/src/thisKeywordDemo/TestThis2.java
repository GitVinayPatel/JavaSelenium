package thisKeywordDemo;

// this: to invoke current class method
class A{
	
	void m()
	{
		System.out.println("Hello m");
	}
	
	void n()
	{
		System.out.println("Hello n");
		this.m();
	}
	
}

public class TestThis2 {
	
	public static void main(String [] args)
	{
		A a = new A();
		a.n();
	}
	

}
