package a20_6_26;
public class ch02ex02 {
	public static void main(String[] args) {
		int a=5,b=3;
		System.out.println(a/b);
		System.out.println(a&b);
		System.out.println(a/(double)b); 		//2�� �߿� �ϳ��̻� (double)�� �־��ָ� �Ǽ�ȭ�� �Ǿ ����ε� ������ ����� ���´�
		System.out.println(a==b);				//a�� b�� ���Ĵ� ���� �׷��� false�� ����
		System.out.println(a>=b);				//true
		System.out.println(a!=b);				//a�� b�� ���� �ʳ�? true
		System.out.println(a>b && b==3);		// && �ΰ� ���̸� �׸���~�� and�� �� �� true��� true��� ����
		System.out.println(a<b && b==3);		//���߿� �ϳ��� false�̱� ������ ����� false
		System.out.println(a>b||b==3);			//���� ������ || ������ �����̶�� ��. �̰��� or�� ���߿� �ϳ��� true�̸� true�� ���
		System.out.println(a<b||b==4);			//�� �� false�̸� false�� ���
		System.out.println(!(5>3));				// 5>3�� true������ !�� �پ false�� ����
		
	}
}
