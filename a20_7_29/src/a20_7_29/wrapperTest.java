package a20_7_29;
//�⺻�ڷ�(����)--->����Ŭ����--->���ڿ�
public class wrapperTest
{
	public static void main(String[] args)
	{
		int myint=567;							//���� -> ����Ŭ������ �����غ���
		
		Integer wi=new Integer(myint);			//ù��° ���
		Integer wi2=Integer.valueOf(myint);		//�ι�° ���		<-- �������� �� ����� ��õ�Ͻ�
		
		String si=wi.toString();
		
		System.out.println(myint+10);			//���ڿ�+10
		System.out.println(si+10);				//���ڿ�+10
		
		
		
		
	}

}
