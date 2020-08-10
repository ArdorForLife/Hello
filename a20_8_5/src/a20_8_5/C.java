package a20_8_5;


class A {
	
}

class B extends A {
	
}

public class C {
	public static C getC() {					//내 자신(C)를 객체화하는 또다른 방법.
		return new C();
	}
	
	public static void main(String[] args) {
		A kim=new A();		
		B bkim=new B();							//B라는 클래스의 객체를 b라고 명명해서 만들어라. B클래스의 전체 자료가 다 b에 왔다고 생각해야한다.
		C ckim=new C();							//내 자신(C)도 객체화가 된다. 그냥 할수있다					
		C cpark=getC();							//13line의 getC가 오는것. 이 방법이 20line보다 고수의 방법
		
	}

	
}
