package a20_7_9;
//100�� �����Ͽ� 1--100���� �հ踦 ����ϴ� sum()�޼��� �����
//��, ��� ���� �����Ͻÿ�
public class ch06ex03 {
	
	public static int sum(int a)
	{
		int hap=0;
		for(int i=1;i<=a;i++)
		{
			hap=hap+i;
		}
		return hap;
	}
	public static void main(String[] args) {
		int res=sum(100);
		System.out.println(res);
	}
}