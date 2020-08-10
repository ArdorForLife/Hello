package a20_6_29;
public class ch03ex02 {
	public static void main(String[] args) {
		int a=10, b=3;				//4byte			정수형(byte,short,long)
		double c;				//8byte			실수형(float)				
		char x;					//자바에서만 2byte 원래는 char는 1byte . 영어는 1byte 나머지 한글,한자,일본자는 2byte 그러나 java에서는 2바이트이다!
		String name;
		boolean t;				//boolean은 1byte 왜냐? true/false 밖에 없기 때문에
		System.out.println(a+b);
		System.out.println(a*b);
		System.out.println(a/(double)b);				//나누기(/)는 정수를 정수로 나누면 몫만 나온다 , 정확한 나누기 값을 알고 싶으면 나누는 숫자중에 하나 이상에 (double)을 붙여준다
		System.out.println(a%b);				//나누기(%)는 정수를 정수로 나누면 나머지만 나온다
		a++;					//1씩 증가. 같은 것 a=a+1, a++, ++a
		b--;					//1씩 감소. 같은 것 b=b-1, b--, --b
		a=a+b;					// a+=b 축약형
		System.out.println(a);
		System.out.println(b);
		int z;					//교환법(교체법) z는 교체를 위한 변수
		z=a;
		a=b;
		b=z;
		System.out.println(a);
		System.out.println(b);
			}
}
