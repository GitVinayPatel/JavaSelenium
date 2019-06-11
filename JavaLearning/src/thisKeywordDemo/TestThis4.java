package thisKeywordDemo;

//this: to pass as an argument in the method

public class TestThis4 {
	
	void m(TestThis4 a){
		System.out.println("method invoked");
	}
	
	void n ()
	{
		m(this);
	}
	public static void main(String[] args) {
		
		TestThis4 b=new TestThis4();
		
		b.n();
		
		new TestThis4().n();
		
		TestThis4 c;//declaration of object
		c=new TestThis4();//This is an initialization of object OR memory allocation
		c.n();
		int a;
		a=10;
		TestThis4 d;
		d= new TestThis4();
		d.n();
		
	}

}
