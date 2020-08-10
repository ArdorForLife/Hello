package a20_6_29;
public class ch03ex05 {
	public static void main(String[] args) {
		//int num01=3.5;		//실수형은 기본적으로 8byte이다. 그런데 4byte짜리인 int에 넣을 수가 없다.
		int num01=(int)3.5;		//cast라고 한다. 3.5를 int방에 넣어준다.
		double num02=5;			//정수형 상수를 실수형 변수에 넣을 수 있다
		System.out.println(num01);
		System.out.println(num02);
		
		
	}
}
