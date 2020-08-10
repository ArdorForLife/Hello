package a20_8_5;

public class Triangle extends Shape {
	private int w,h;

	public double area() {
		res=(w*h)/2.0;
		return res;
	}

	void show() {
		System.out.println("»ï°¢ÇüÀÇ ³ĞÀÌ="+res);
	}

	public void setW(int w) {
		this.w = w;
	}

	public void setH(int h) {
		this.h = h;
	}
	
}
