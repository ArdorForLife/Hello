package a20_7_1;

public class ch05ex03
{

	public static void main(String[] args)
	{
		int i=1;
		for(;;)									//��(��)������ for���� ��. ���ѹݺ���
		{
			System.out.println("ȥ�ڵ���"); 		//��ǻ�� ���������� �ݺ�.
												//�̷� ��Ȳ�� server�� ��Ȳ
			if(i>100) break;					//������ �ȿ� �ְ� 100�� ������ break�� ���� ������ ������ //break�� ���ĸ� �ݺ����� ���������� ��
			i++;								//�ʱⰪ�� �ۿ� �ְ� ������ �ȿ� �ְ�
												//for������ �̷������ε� ��� ����
		}
		
	}

}
