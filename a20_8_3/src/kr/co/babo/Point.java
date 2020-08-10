package kr.co.babo;							//kr 하위 co 하위 babo에 저장된다는 뜻

public class Point {
	private int x,y;
	public Point() {	}					//디폴트 생성자
	public Point(int x, int y) {			//2개짜리 생성자
		this.x=x;
		this.y=y;
	}
	public void setX(int x) {				//멤버변수에 값을 저장하기 위한 setter
		this.x=x;
	}
	public void setY(int y) {
		this.y=y;
	}
	
	public int getX() {						//값을 return 하기 위한 getter this는 없어도 됨
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	
	public void show() {
		System.out.println(x+","+y);
	}
}
