package a20_7_30;

class point extends Object {
	private int x,y;

	public point(int x, int y) {					//두개짜리 생성자 메소드
		super();
		this.x = x;
		this.y = y;
	}
	public point() {								//디폴트 생성자 메소드
		super();
		// TODO Auto-generated constructor stub
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void show() {
		System.out.println(x+","+y);
	}
	@Override
	public boolean equals(Object obj) {
		point pt;
		if(obj instanceof point) {
			pt=(point) obj;
			if(pt.x==this.x && pt.y==this.y) return true;
		}
		return false;
	}
		
}

public class StringTest extends Object {			//extends Object 는 생략되어있음.

	public static void main(String[] args) {
		point kim=new point(10,20);
		point lee=new point(10,20);
		if(kim==lee) System.out.println("같다");		//==은 주소가 같냐고 묻는 것
		else System.out.println("다르다");
		if(kim.equals(lee)) System.out.println("같다");	//같냐고 묻는 함수가 equals				//sp가 ep를 데리고 위의 equals에 전달한다
		else System.out.println("다르다");
	}

}
