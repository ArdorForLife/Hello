package a20_7_6;

public class ch06ex01 {
	public static void main(String[] args) {
		int b,c,d,e,f,g;
		int a[]=new int[10];				//�д� ��: a �迭 new(���ο�) ���������� 10��	. ���ο� �޸� ��ƶ�. ������ 10�� . �̸��� a�̴�.			//���ȣ�� �迭 �Ұ�ȣ�� �޼���(�Լ�) �߰�ȣ�� ��)
		a[0]=10;							//a[__]  __ �κ��� ÷��(��ġ) ��� �θ��� ���� 0�� ÷���̴�. 0�� ��ġ. a�� 0�濡 10�� �־�� �̷� ����.
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
		for(int i=0;i<5;i++) {				//i<5�� i<=4�� �Ҽ��� ������ i��0���� �����ϱ� ������ ������ �ٷ� �� �� �ְ� ǥ���Ϸ��� i<5 �̷��� ���°� ����. �̷��� �ڵ�!!
			System.out.println(a[i]);
			
		}
	}
	
}