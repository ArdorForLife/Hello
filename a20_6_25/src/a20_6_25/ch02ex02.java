package a20_6_25;
public class ch02ex02 {
	public static void main(String[] args) {
		int a=10, b=3, c, d, e, f, g;
		c=a+b;					//����  c=10+3, c=13 ����
		d=a-b;					//����  d=10-3, d=7   ����
		e=a*b;					//����  e=10*3, e=30 ����
		f=a/b;					//������(���� ���ϴ�) f=10/3,  f=3 ����       -> �ٸ� ������ ����(int�� int)�� ���� ���ϴ� �������� �� �� ������ ����
		g=a%b;					//������(�������� ���ϴ�)  g=10%3,  g=1 ���� -> �߰��� ������ ������ ��� ���
		System.out.println("����="+c);
		System.out.println("����="+d);
		System.out.println("����="+e);
		System.out.println("������(��)="+f);
		System.out.println("������(������)="+g);	
	}
}
