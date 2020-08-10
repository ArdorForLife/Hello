package a20_7_9;

public class ch06ex01 {
	public static void sum() {								//sum method를 만들었다. static은 정적메모리에 입력하라? 이런 뜻. return 값이 없기 때문에 void를 씀. 
		System.out.println("불렀어요");						//메인 method와 따로 만드는 이유는 각각의 method 이기 때문이다.
		System.out.println("아니면 말고");
		System.out.println("돌아가야지");
		
	}
	public static void line() {
		System.out.println("====================");
	}
	
	
	public static void main(String[] args) {
		line();												//line의 동작을 불러라
		sum();												//main method 안에서 바깥의 sum method의 동작을 불러라
		line();												//line의 동작을 불러라
		
	}
}
