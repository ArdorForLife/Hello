package a20_8_27;

class Outer1 {								//바깥클래스
	private int outdata = 100;				//바깥클래스 내부의 변수
	public Object method() {				//바깥클래스 내부의 메소드
		final int data = 200;				//바깥클래스 메소드 내부의 변수
		class Inner {						//바깥클래스 내부의 메소드 내부의 클래스
			public String toString() {		//바깥클래스 내부의 메소드 내부의 클래스 내부의 메소드
				return "결과="+(outdata+data);
			}
		}
		return new Inner();					//바깥클래스 내부의 메소드에서 리턴
	}
}

public class innterTest4 {
	public static void main(String[] args) {
		Outer1 out = new Outer1();
		Object obj = out.method();
		System.out.println(obj.toString());
	}

}
