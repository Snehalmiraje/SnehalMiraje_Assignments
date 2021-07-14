package assignment2;

abstract class shape {
	abstract void draw();
	
}
class circle extends shape{

	@Override
	void draw() {
		System.out.println("This is circle..!");
	}
	
}
class rectangle extends shape{

	@Override
	void draw() {
		System.out.println("This is rectangle..!");
		
	}
	
}
class cube extends shape{

	@Override
	void draw() {
		System.out.println("This is cube..!");
		
	}
	
}

public class shapeDemo {

	public static void main(String[] args) {
		circle c=new circle();
		cube cc=new cube();
		rectangle r=new rectangle();
		c.draw();
		cc.draw();
		r.draw();

	}

}
