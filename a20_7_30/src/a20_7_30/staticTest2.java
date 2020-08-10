package a20_7_30;

class circle{
	private int r;
	private double res;
	public void setR(int r) {
		this.r=r;
	}
	public void area() {
		res=r*r*Math.PI;					//Math라는 클래스 안에 있는 PI는 static이기 때문에 이런식으로 호출이 가능함.
	}
	public void show() {
		System.out.println("원넓이="+res);
	}
}



public class staticTest2 {

	public static void main(String[] args) {
		circle kim=new circle();
		kim.setR(5);
		kim.area();
		kim.show();
	}

}
