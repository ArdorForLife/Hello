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
		//�ڿ� L�ڸ� ���̸� long �ڷ����� �����ٴ� �̾߱��̴�.
		//int a=1234;  <-���� int(4����Ʈ)
		//long b=1234L;<-���� long(8����Ʈ) long�濡 long���� �ִ´ٴ� ���� ��Ȯ�� ��.
		//int c=1234L; <-int�濡 long���� �ִ´ٴ� ���̱� ������ ���� ����.
		long I2=1_000_000_000L;
	}
}
