package a20_7_13;
//두 수를 전달받아서 두 수를 교체하는 swap()메서드를 만드시오
public class aTest1 {

	public static void swap(int a,int b)				//리턴은 값이 1개밖에 되지 않는다.
	{
		System.out.println(a+","+b);
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println(a+","+b);
	}
	
	public static void main(String[] args) {			//클래스 안에 main메서드가 가장 먼저 실행된다. 그 외에 메서드는 main메서드 위나 아래나 어디든 있어도 상관은 없다.
		swap(10,20);
		
	}

}
