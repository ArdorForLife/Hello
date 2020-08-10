package a20_7_13;

public class ch07ex01 {

	public static void main(String[] args) {
		붕어빵 kim;	//kim은 붕어빵형의 객체(변수)					//new 클래스(); 하면 메모리에 붕어빵 클래스가 할당된다.		//kim이라는 변수,객체는 붕어빵 자료형이다. 붕어빵(자료형) kim(변수,객체)
		
		int a;		//a는 정수형의 변수
		a=10;		//의미없음. 그냥 비교하려고 넣어은거임.
		
		kim=new 붕어빵();
		kim.팥=2;
		kim.반죽=10;
		kim.만들기();
		kim.꺼내기();
		
		붕어빵 lee;
		lee=new 붕어빵();
		lee.팥=1;
		lee.반죽=5;
		lee.만들기();
		lee.꺼내기();
		}

}
