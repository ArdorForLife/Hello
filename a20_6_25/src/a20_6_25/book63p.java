package a20_6_25;
public class book63p {
	public static void main(String[] args) {
		byte b1=-128;
		//byte b2=128;
		//type mismatch: cannot convert from int to byte
		System.out.println(b1);
		
		int i1=15;
		int i2=0b1111;
		int i3=017;
		int i4=0xf;
		System.out.println(i1+","+i2+","+i3+","+i4);
		
		int i5=1_000_000_000;
		System.out.println(i5);
		
		//long I1=10000000000;
		//The literal 10000000000 of type int is out of range
		//뒤에 L자를 붙이면 long 자료형을 가진다는 이야기이다.
		//int a=1234;  <-정수 int(4바이트)
		//long b=1234L;<-정수 long(8바이트) long방에 long값을 넣는다는 보다 정확한 것.
		//int c=1234L; <-int방에 long값을 넣는다는 말이기 때문에 맞지 않음.
		long I2=1_000_000_000L;
	}
}
