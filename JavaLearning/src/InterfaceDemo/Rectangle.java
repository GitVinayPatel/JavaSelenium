package InterfaceDemo;

public class Rectangle implements Drawable {

	@Override
	public void draw() {
		System.out.println("Draw Rectangle");
	}

	@Override
	public void paint() {
		System.out.println("Paint Rectangle");
		
	}
	
	public void RectangleeMethod(){
		System.out.println(" Recatngle own Method");
	}

}
