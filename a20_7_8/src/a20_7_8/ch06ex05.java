package a20_7_8;
//2�� �迭�� ����.
public class ch06ex05 {
	public static void main(String[] args) {
		int a[][]= {{90,88,77},{67,89,54},{99,30,100},{0,0,0}}; //c������ a[][3]�� �˾Ƽ� 3�ķ� ���߳� java������ �ȵ� 3���� ���߰� �� ���� ������ 0���� ó����. �� ���¿����� a[3][3]�� �Ǵ� ���� �ȿ� ���� ������ a[][]= //������ �հ踦 ���ؼ� 000�� �߰���
		int i,j;
		int sum=0;
		//�׳� a.length��� ������ ���� ����? ���� ����? 
		
		System.out.println("��ȣ\t����\t����\t����\t�հ�");
		for(i=0;i<a.length-1;i++)
		{
			sum=0;									//sum�� ����ؼ� �������� ������ �ǵ��ƿ��� �� sum�� �ʱ�ȭ���� �����.
			System.out.print((i+1)+"\t");
			for(j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+"\t");
				sum=sum+a[i][j];
				a[3][j]=a[3][j]+a[i][j]; 			//�߿���. ������ ��!
			}
			System.out.println(sum);
		}
		System.out.print("�հ�\t");
		for(i=0;i<3;i++) {
			System.out.print(a[3][i]+"\t");
		}
	}

}
