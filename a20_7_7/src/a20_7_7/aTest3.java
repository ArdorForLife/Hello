package a20_7_7;
//�迭�� ����� �������� ¦���� ��� b�迭�� �����Ͻÿ�
public class aTest3 {
	public static void main(String[] args) {
		int a[]= {10,90,86,77,90,23};
		int len=a.length;
		int i;
		int b[]=new int[len];
		int x=0;
		for(i=0;i<len;i++) {
			if(a[i]%2==0)
			{
				b[x]=a[i];
				x++;
			}
		}for(i=0;i<x;i++)
		System.out.println(b[i]);
		
		//������ ���. �Է� ���� ��� ���� �ϴ°� �� �� ���ٰ� �ϼ���

/*�����		for(i=0;i<len;i++) {
			if(a[i]%2==0)
			{
				b[x]=a[i];			//x�� ������� �ʰ� b[i]=a[i]; �� ���ԵǸ� Ȧ���� �浵 �Ѿ�� 0���� ó���ȴ�. �װ� ���� �����ʴ�. �׷��� ���� x�� ��Ƽ� ǥ�����ش�.
				System.out.println(b[x]);
				x++;
			}
		}
	*/
	}

}
