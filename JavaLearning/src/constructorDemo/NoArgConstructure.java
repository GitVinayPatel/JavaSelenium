package constructorDemo;

public class NoArgConstructure {
	
	String name;
	
	//Constructor
	NoArgConstructure(){
		this.name="vinay";
	}
	
	public static void main(String [] args){
	
	NoArgConstructure obj1 = new NoArgConstructure();
	
	System.out.println(obj1.name);
	}

}
