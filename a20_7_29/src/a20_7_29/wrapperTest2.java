package a20_7_29;
//���ڿ�80�� ����80���� ����
public class wrapperTest2 
{
	public static void main(String[] args) 
	{
		String jumsu="80";						//���ڿ�
		Integer ijum=Integer.valueOf(jumsu);	//������(�Ʒ����� �������� ���� ������)
		int ia=ijum.intValue();					//�̷��� 3�� ������ ���ľ� ��
		
		System.out.println(ia+2);				//����� ���������� +2
		System.out.println(jumsu+2);			//���� ���ڿ�+2
		
		String kor="90";						//�ٸ����. ���ڿ� 90�� ��������
		int ikor=Integer.valueOf(kor);			//2�� ������ �ٲ�. auto unboxing�̶�� ��
		
		
		
	}

}
