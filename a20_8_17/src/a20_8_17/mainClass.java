package a20_8_17;

//인터페이스란 클래스와 동일하게 멤버변수와 멤버메소드로 구성된 구조이다.
//자바는 단일상속만 가능하다. 이런 단점을 보완하게 위해 인터페이스가 나왔다.
//인터페이스는 자식클래스에게 상속해주는 역할만 한다.
//스스로는 아무일도 할 수 없고 new로 생성되지 않는다.

//인터페이스에서
//멤버변수는 public static final 성격을 가진다.
//멤버메소드는 public abstract 성격을 가진다 즉 선언만 가능하고 자식이 오버라이딩하여 사용하여야 한다.

//class A {}
//class B {}
//class C extends A, b {}     (X) extends뒤에는 친부모 1개만 온다
//class D extends B {}		  (O)

//interface X {}
//class Y extends X {}		  (X) 인터페이스는 extends를 쓰면 안된다 문법 오류
//class Y implements X {}	  (O) 

//class Z extends A implements X	(O)
class childTest implements interTest{					//interface는 implements로 상속받는다.
	public void draw() {
		
	}					
	
}

public class mainClass {

	public static void main(String[] args) {
		//new interTest();								//이것은 안됨.
	}

}
