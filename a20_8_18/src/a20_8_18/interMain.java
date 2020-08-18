package a20_8_18;

public class interMain {

	public static void call(Shape s) {
		if(s instanceof Circle) {
			Circle c = (Circle) s;
			c.area();
			c.show();
		}
		if(s instanceof Rectangle) {
			Rectangle r = (Rectangle) s;
			r.area();
			r.show();
		}
		if(s instanceof Triangle) {
			Triangle t = (Triangle) s;
			t.area();
			t.show();
		}
		
	}
	
	public static void main(String[] args) {
		Circle c = new Circle(5);
		call(c);
		
		Rectangle r = new Rectangle(5,6);
		call(r);
		
		Triangle t = new Triangle(5,6);
		call(t);
	}

}
