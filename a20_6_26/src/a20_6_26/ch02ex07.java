package a20_6_26;
public class ch02ex07 {
	public static void main(String[] args) {
		int a=10,b=3;
		//System.out.println(a&&b);			//에러.10그리고 3   어쩌라는 말?
		//System.out.println(a||b);			//에러.10또는 3   어쩌라는 말?
		System.out.println(a&b);			//비트연산자and.  하나만 쓰면 비트로 생각해서 연산하라는 뜻임
		System.out.println(a|b);			//비트연산자or.  하나만 쓰면 비트로 생각해서 연산하라는 뜻임
		System.out.println(a>b && b==3);
		System.out.println(a&b);
		System.out.println(a|b);
		//a는 1010 b는 0011 &하라는 얘기. 각 자리에 둘다 1이어야만 1이고 그 외엔 0이다
		//a는 1010 b는 0011 |하라는 얘기. 각 자리에 하나라도 1이면 1로 생각.
	}
}
