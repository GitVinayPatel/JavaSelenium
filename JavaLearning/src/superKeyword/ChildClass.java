package superKeyword;

public class ChildClass extends ParentClass {
	
	 String name="Child";
	
	 //1.super() can be used to invoke immediate parent class constructor.
	public ChildClass(){
		super();
		System.out.println("I am Child constructor");
	}
	
	//2.super can be used to refer immediate parent class instance variable.
	public void getStringData()
 
 {
	 System.out.println(super.name);
	 System.out.println(name);
 }
 
	//3.super can be used to invoke immediate parent class method.
 public void getData()
 
 {
	 super.getData();
	 System.out.println("I am child method");
 }


	
	public static void main(String[] args) {
		
	ChildClass cd=new ChildClass();
	cd.getStringData();
	cd.getData();
	 

	}


}
