package a20_7_9;

public class aTest1 {
	public static void main(String[] args) {
		//int [][]a=new int[3][];				//�̰ų� �Ʒ��� �������
		//int a[][]=new int[3][4];				
		int a[][]=new int[3][];					//���� ���� 3��, ���� ���� ����
		a[0]=new int[2];						//0���� 2������ ����(3,4�� ����)
		a[1]=new int[3];						//1���� 3������ ����(4�� ����)
		a[2]=new int[4];						//2���� 4������ ����(�� ����)
		
		System.out.println(a.length);			//3  a�迭�� ���� ����
		System.out.println(a[0].length);		//2  a�迭�� 0���� ��(ĭ)�� ����
		System.out.println(a[1].length);		//3  a�迭�� 1���� ��(ĭ)�� ����
		System.out.println(a[2].length);		//4  a�迭�� 2���� ��(ĭ)�� ����
		//java�� ���뼺�� �־ �� �ึ�� ���� ������ ���� �������� �� ����. c���� �Ұ�����.
		
		
	}
	

}
