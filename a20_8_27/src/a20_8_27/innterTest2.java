package a20_8_27;

class circle {
	private int r;
	private double res;
	public circle() {
	}
	public circle(int r) {
		this.r=r;
	}
	public void cal() {
		res = r*r*Math.PI;
	}
	public void show() {
		System.out.println(res);
	}
	public static circle instance = new circle();
	public static circle getInstance() {
		return instance;
		
	}
}


class rectangle {
	int w,h,res;
	public void cal() {
		res = w*h;
	}
	public void show() {
		System.out.println(res);
	}
	public static rectangle rec = new rectangle();
	public static rectangle getRec() {
		return rec;
	}
}


public class innterTest2 {

	public static void main(String[] args) {
		circle c = new circle(5);
		c.cal();
		c.show();
		circle c1 = circle.getInstance();
		c1.cal();
		c1.show();
	
		rectangle r = rectangle.getRec();
		r.cal();
		r.show();
	}

}
