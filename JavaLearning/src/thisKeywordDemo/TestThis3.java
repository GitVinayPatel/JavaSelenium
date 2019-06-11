package thisKeywordDemo;

//this() : to invoke current class constructor
class B
{
B()
{
	System.out.println("I am B constructor");
}

B(int x)
{
	this();
	System.out.println(x);
}

}

public class TestThis3 {

	public static void main(String[] args) {
		
		B b = new B(10);
		}

}
