package a20_7_2;
//1���� 100����(a) �հ�(hap)�� ���Ͻÿ�
//
public class ch05ex03 {

	public static void main(String[] args) {
		int a, hap;
		a=1;
		hap=0;
		do {							//while�� ������ true�̸� do ���� �߰�ȣ�� ���� �ƴϸ� ��������
			System.out.println(a);
			hap=hap+a;
			a++;
		}while(a<=100);					//while�ݺ����� do while�ݺ����� ���̴� ó�� 1���� �����غ����� �ƴϳ��� ����
										//while�� ���ǿ� ���� Ƚ���� 1���� �������� ���� ���� �ִ�
										//do while�� ���ǿ� ���� Ƚ���� �ּ� 1���� �����Ѵ�
										//���� while�� 0ȸ �̻� ����, do while�� 1ȸ �̻� ����
										//�ַ� while�� ������ �� 1���� �ϱ� �ؾ��ϴ� ��Ȳ�̸� do while�� ��
		System.out.println("�հ�="+hap);
	}

}
