package a20_8_18;

public class Rectangle implements Shape {

	private int w,h;
	private int res;
	
	public Rectangle() {
		
	}
	
	public Rectangle(int w, int h) {
		this.w=w;
		this.h=h;
	}
	
	public void area() {
		res=w*h;
	}

	public void show() {
		System.out.println("사각형의 넓이="+res);
	}

}
