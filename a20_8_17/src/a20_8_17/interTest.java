package a20_8_17;

public interface interTest {				//인터페이스는 클래스와 동급 -> 멤버메소드와 멤버변수로 이루어진 구조!
	int red=1;								//인터페이스에서 멤버변수는 public static final 성격을 가짐 (생략 되어있음)
	int green=2;							//인터페이스에서 멤버변수는 final성격이기 때문에 각 변수에 값을 대입해주어야 한다.
	int blue=3;
	public void draw();						//인터페이스에서 멤버메소드는 public abstract 메소드 성질을 가짐 (생략 되어있음)
											//멤버메소드는 추상성질만 가지고 있기 때문에 선언만 해야한다.
}
