//상속이 되어서 붕어틀,반죽,팥,show(),만들기(),생성자들까지 다 상속됨.
//이때 show()처럼 상속된 메소드와 자신의 메소드가 동일할때는 자신의 것이 실행된다. -> 재정의(overriding)이라고 한다.
public class 계란빵 extends 붕어빵 {
	private int 계란틀;
	private int 계란;
	public void show() {
		System.out.println(계란틀);
	}
	public void 만들기2() {
		계란틀=반죽+계란+반죽;
	}
	public 계란빵() {
		System.out.println("안녕 계란빵(자식)");
	}
	public 계란빵(int 계란, int 반죽) {
		this.계란=계란;
		this.반죽=반죽;
	}
}
