package a20_6_29;
public class ch04ex01 {
	public static void main(String[] args) {
		int x=8;
		if(x%2==0)						//x�� ¦���� ��� ���� ����. Ȧ���Ķ�� ���� ������ x%2==1 ���� ������ �ȴ�. Ȥ�� x%2!=0 ���� ��� Ȧ���Ĵ� �����.
		System.out.println("¦��");		//5�� 2�� ���� �������� 0 �³�? true�̸� ù������ "¦��" false�� �ι�°������ "Ȧ��"
		else
		System.out.println("Ȧ��");		//�̴�� �ϸ� 0�� �³�? ��! �׷��� ¦���� ������ �׹ؿ��� �׳� �״�� Ȧ�� sysout�� �Ǽ� Ȧ���� ���´�. ���� Ʋ�� ����! �׷��� �߰��� else�� �־�� �Ѵ�.
										//else�� ������ if ���� ������ true�� ���̰� else ���� ������ false�� ���� �ȴ�.
		System.out.println("��");
		
		int k=11;
		if(k%2!=0)
		System.out.println("Ȧ��");
		else
		System.out.println("¦��");
		
	}
}
