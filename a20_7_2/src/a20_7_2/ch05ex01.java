package a20_7_2;
//1���� 100���� ���(while)
//�� �հ踦 ���Ͻÿ�
//5�� ����� ������ ���Ͻÿ�
public class ch05ex01 {

	public static void main(String[] args) {
		int a,sum,cnt;
		a=1;								//�ʱⰪ
		sum=0;
		cnt=0;
		while(a<=100) {						//����		//��ȣ���� ������ �´ٸ� �߰�ȣ ���� �����ϰ� �ٽ� while�� �ݺ��϶�
			System.out.println(a);
			sum=sum+a;
			a++;							//1�� ����
			if(a-(a/5)*5==0) cnt++;
			}
		System.out.println("��ü�հ�="+sum);
		System.out.println("5�� ����� ����="+cnt);
		
	}

}
