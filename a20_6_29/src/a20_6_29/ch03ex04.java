package a20_6_29;
public class ch03ex04 {
	public static void main(String[] args) {
		int a=10,b=30,c=90, max;
		System.out.println((a>b)?"��":"�ƴϿ�");
		max=(a>b)?a:b;							//false�̸� a:b �߿��� �ڿ� b���� max���� �ȴ�. true�̸� a��. max�� 3�� ������ ��� �Ѵ�.
		System.out.println("�ִ밪="+max);
		max=(max>c)?max:c;
		System.out.println("�ִ밪="+max);
	}
}
