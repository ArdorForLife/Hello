package a20_7_1;

import java.util.Scanner;

//5ȸ ����(jumsu)�� �Է¹޾Ƽ�
//���(avg)�� ���϶�
public class ch05ex02
{
	public static void main(String[] args)
	{
		int i,jumsu, sum=0, cnt=0;
		double avg;
		Scanner scanner=new Scanner(System.in);
		
		for(i=1;i<=5;i++)					//�̷� ���� �׳� i�� ����ְ� 5�� �ݺ��ϰ� ���ִ� �뵵�� ����ϴ� ����
		{
			jumsu=scanner.nextInt();
			sum=sum+jumsu;
			cnt++;
		}
	avg=(double) sum/cnt;

	System.out.println("�հ�="+sum);
	System.out.println("Ƚ��="+cnt);
	System.out.println("���="+avg);
		
	}	

}
