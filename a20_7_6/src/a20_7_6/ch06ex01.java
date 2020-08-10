package a20_7_6;

public class ch06ex01 {
	public static void main(String[] args) {
		int b,c,d,e,f,g;
		int a[]=new int[10];				//읽는 법: a 배열 new(새로운) 정수형으로 10개	. 새로운 메모리 잡아라. 정수로 10개 . 이름은 a이다.			//대괄호는 배열 소괄호는 메서드(함수) 중괄호는 블럭)
		a[0]=10;							//a[__]  __ 부분을 첨자(위치) 라고 부른다 따라서 0은 첨자이다. 0번 위치. a의 0방에 10을 넣어라 이런 말임.
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
/*		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
*/
		for(int i=0;i<5;i++) {				//i<5를 i<=4로 할수도 있지만 i가0부터 시작하기 때문에 갯수를 바로 볼 수 있게 표현하려면 i<5 이렇게 적는게 좋다. 이런게 코딩!!
			System.out.println(a[i]);
			
		}
	}
	
}