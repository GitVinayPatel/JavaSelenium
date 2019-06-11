package thisKeywordDemo;

public class Student {
	
	int rollno;
	String name;
	
	Student(int rollno,String name){
		this.rollno=rollno;
		name=name;
		//In the above example, parameters (formal arguments) and instance variables are same. So, we are using this keyword to distinguish local variable and instance variable.
	}
	
	void display()
	{
		System.out.println(rollno+" "+name);
	}

	public static void main(String[] args)
	{
		Student S1=new Student(10, "Vinay");
		Student S2=new Student(10, "Vinod");
		S1.display();
		S2.display();
	}
}
