package a20_7_1;
//a�� 1���� 100���� 1�� �����ϵ�
//���� a%3==0�̸� a�� 3�� ����̴�
//3�� ����� �հ�(sum)�� ����(cn)�� ���Ͻÿ�
public class ch05ex01
{
	public static void main(String[] args) 
	{
		int a,na,sum,cn;
		sum=0;cn=0;
		for(a=1;a<=100;a++)
		{
			na=a%3;							//na=a-(a/3)*3;
			if(na==0)						//if������ ���� ������ �ְ� ������ �߰�ȣ�� �ִ´�. 
			{
				sum=sum+a; cn++;
			}
		}
		System.out.println(sum);
		System.out.println(cn+"��");
		System.out.println((double) sum/cn);
	}
}
