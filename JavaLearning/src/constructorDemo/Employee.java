package constructorDemo;

public class Employee {
	
	int empid;
	String empname;
	
	Employee(int id,String name){
		this.empid=id;
		this.empname=name;
	}
	
	void info()
	{
		System.out.println("id:"+empid+" "+"name:"+empname);
	}
	
	public static void main(String args[]){
		
		Employee obj1=new Employee(101,"Vinay");
		Employee onj2=new Employee(102,"Raj");
		
		obj1.info();
		onj2.info();
		
		
	}

}
