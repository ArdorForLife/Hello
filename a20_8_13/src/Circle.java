
public class Circle extends Shape {

	
	private int r; 
	
	public void draw() {					//추상메소드를 선언 해놓으면 상속받은 자식이 정의해야한다. 아무것도 정의하지 않는다고 하더라도 이 메소드는 지우면 에러가 뜬다.
	}
	public void area() {
		res=r*r*Math.PI;
	}
	public void show() {
		System.out.println("원넓이="+res);
	}
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	
	
}
