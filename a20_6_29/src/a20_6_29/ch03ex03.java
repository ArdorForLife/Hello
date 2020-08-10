package a20_6_29;
public class ch03ex03 {
	public static void main(String[] args) {
		int a=12, b=4;
		int c,d,e,f;
		c=a^b;			//^는 xor한 결과를 나타냄 xor(숫자를 2진법으로 나타내서 각 자리수의 두 비트가 다르면 1, 같으면 0) 마치 두 비트의 합과 비슷함
						//     1100-12
						// xor 0100-4
						//	   1000-8으로 연산 됨  
		d=a<<2;			//왼쪽으로 2비트 이동 - 원래 숫자를 1비트 왼쪽으로 이동할 때마다 2의 1제곱씩 곱해짐.
						//  00001100-12
						//0000110000-48으로 바뀜
		e=a>>2;			//오른쪽으로 2비트 이동 - 원래 숫자를 1비트 오른쪽으로 이동할 때마다 2의 1제곱씩 나눠짐.
						//  00001100-12
						//  00000011-3으로 바뀜
		f=~a;			//1의보수+1 (2의보수)
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
	}
}
