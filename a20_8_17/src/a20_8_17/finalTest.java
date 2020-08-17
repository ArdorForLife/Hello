package a20_8_17;

final class parentTest{							//final 클래스는 상속해줄 수 없다.
	
}

public class finalTest {

	final int x=1;								//x가 1로 고정되었으니 바꿀 수 없다. 라는 뜻
	final double PI=3.141592;					//일반적으로 이런식일 때 많이 사용. 그 때 변수명은 주로 대문자로 구성해주는 편이다.
	
	public static void main(String[] args) {
		//x=x+10;								//이런 식으로 x값에 변화를 줄 수 없다.
		//x=100;								//이런 식으로도 불가능
		
	public final void show() {					//재정의(overriding)안됨
		System.out.println(x);
	}
		
	
	}

}
