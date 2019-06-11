package InterfaceDemo;

public class Circle implements Drawable {

	@Override
	public void draw() {
		System.out.println("Draw Circle");
		
	}

	@Override
	public void paint() {
		System.out.println("Paint Circle");
		
	}
	
	public void CircleMethod(){
		System.out.println(" Circle own Method");
	}

}
