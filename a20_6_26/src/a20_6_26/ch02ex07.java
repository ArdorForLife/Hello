package a20_6_26;
public class ch02ex07 {
	public static void main(String[] args) {
		int a=10,b=3;
		//System.out.println(a&&b);			//����.10�׸��� 3   ��¼��� ��?
		//System.out.println(a||b);			//����.10�Ǵ� 3   ��¼��� ��?
		System.out.println(a&b);			//��Ʈ������and.  �ϳ��� ���� ��Ʈ�� �����ؼ� �����϶�� ����
		System.out.println(a|b);			//��Ʈ������or.  �ϳ��� ���� ��Ʈ�� �����ؼ� �����϶�� ����
		System.out.println(a>b && b==3);
		System.out.println(a&b);
		System.out.println(a|b);
		//a�� 1010 b�� 0011 &�϶�� ���. �� �ڸ��� �Ѵ� 1�̾�߸� 1�̰� �� �ܿ� 0�̴�
		//a�� 1010 b�� 0011 |�϶�� ���. �� �ڸ��� �ϳ��� 1�̸� 1�� ����.
	}
}
