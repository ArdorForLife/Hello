package a20_6_29;
public class ch03ex02 {
	public static void main(String[] args) {
		int a=10, b=3;				//4byte			������(byte,short,long)
		double c;				//8byte			�Ǽ���(float)				
		char x;					//�ڹٿ����� 2byte ������ char�� 1byte . ����� 1byte ������ �ѱ�,����,�Ϻ��ڴ� 2byte �׷��� java������ 2����Ʈ�̴�!
		String name;
		boolean t;				//boolean�� 1byte �ֳ�? true/false �ۿ� ���� ������
		System.out.println(a+b);
		System.out.println(a*b);
		System.out.println(a/(double)b);				//������(/)�� ������ ������ ������ �� ���´� , ��Ȯ�� ������ ���� �˰� ������ ������ �����߿� �ϳ� �̻� (double)�� �ٿ��ش�
		System.out.println(a%b);				//������(%)�� ������ ������ ������ �������� ���´�
		a++;					//1�� ����. ���� �� a=a+1, a++, ++a
		b--;					//1�� ����. ���� �� b=b-1, b--, --b
		a=a+b;					// a+=b �����
		System.out.println(a);
		System.out.println(b);
		int z;					//��ȯ��(��ü��) z�� ��ü�� ���� ����
		z=a;
		a=b;
		b=z;
		System.out.println(a);
		System.out.println(b);
			}
}
