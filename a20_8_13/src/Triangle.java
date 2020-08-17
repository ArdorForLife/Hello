
public class Triangle extends Shape {

	private int w,h;
	
	public void draw() {
	}
	public void area() {
		res=(w*h)/2.0;
	}
	public void show() {
		System.out.println("»ï°¢ÇüÀÇ ³ĞÀÌ="+res);
	}
	public int getW() {
		return w;
	}
	public void setW(int w) {
		this.w = w;
	}
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}

}
