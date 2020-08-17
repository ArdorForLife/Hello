
public abstract class Shape {
	protected double res;
	public void show() {
		System.out.println(res);
	}
	public abstract void draw();		//추상 메소드는 선언만 한다. 그래서 {}를 쓰면 에러가 난다.
	public abstract void area();		//추상 메소드
}
