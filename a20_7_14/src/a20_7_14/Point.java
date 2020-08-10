package a20_7_14;

public class Point {
	private int x,y;					//멤버변수(재료)는 비공개				//멤버변수
	public void show() {				//멤버메소드(레시피)는 공개
		System.out.println("x="+x);
		System.out.println("y="+y);
	}	
	public void setX(int x) {			//멤버변수의 이름을 this.x, this.y라고 지정해줄수 있다.
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void set(int x,int y) {		//2개를 저렇게 미리 정해진 양식을 쓸 순 없다. 직접 찍어주어야 한다.
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
}
