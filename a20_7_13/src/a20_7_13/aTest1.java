package a20_7_13;
//�� ���� ���޹޾Ƽ� �� ���� ��ü�ϴ� swap()�޼��带 ����ÿ�
public class aTest1 {

	public static void swap(int a,int b)				//������ ���� 1���ۿ� ���� �ʴ´�.
	{
		System.out.println(a+","+b);
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println(a+","+b);
	}
	
	public static void main(String[] args) {			//Ŭ���� �ȿ� main�޼��尡 ���� ���� ����ȴ�. �� �ܿ� �޼���� main�޼��� ���� �Ʒ��� ���� �־ ����� ����.
		swap(10,20);
		
	}

}
