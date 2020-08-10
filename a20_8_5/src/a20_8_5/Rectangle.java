package a20_8_5;

public class Rectangle extends Shape {
	private int w, h;

	public double area() {
		res=w*h;
		return res;
	}

	void show() {
		System.out.println("사각형의 넓이="+res);
	}

	public void setW(int w) {
		this.w = w;
	}

	public void setH(int h) {
		this.h = h;
	}
	
}
