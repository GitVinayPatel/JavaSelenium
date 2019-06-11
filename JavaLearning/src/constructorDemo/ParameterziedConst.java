package constructorDemo;

public class ParameterziedConst {
	
	int var;
	
	ParameterziedConst(int num){
		var=num;
	}

	public static void main(String[] args) {
		
		ParameterziedConst obj1=new ParameterziedConst(1);
		System.out.println(obj1.var);

	}

}
