package a20_6_30;

public class ch04ex04 {

	public static void main(String[] args) {
		int a=10,b=5, c=0;
		char op='+';							
		switch (op) {							//���� switch �ȿ��� �������� �����ϴµ� ��°�� char�� �����ұ� �ƽ�Ű(����)�ڵ� ������ �� ���� �ϳ��� �ƽ�Ű�ڵ��� ������ ��ǻ�Ͱ� �ν��ϱ� ����.
		case '+': c=a+b; break;					//���������� case���ο��� ������ ������������ '+'�� + ���ڰ� ������ ���� ������ switch���� ������
		case '-': c=a-b; break;
		case '*': c=a*b; break;
		case '/': c=a/b; break;
		default: System.out.println("�߸��ȱ�ȣ"); //default�� ��� �Ǳ�� ��
		
		}
		System.out.println(c);					//�߰�ȣ �ۿ� sysout�� �ؾ� ������� Ȯ���� �� ����
	}

}
