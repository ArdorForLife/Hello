package a20_7_3;
//4�� 6�� �ִ�����, �ּҰ���� ���ϱ�
public class ch05Test4 {

	public static void main(String[] args) {
		//�ִ�����
		int a=4,b=6,i,small;
		
		small=(a>b)?b : a;				//a�� b���� ũ��? �׷��� b�� �ְ� �ƴϸ� a�� �־��
		
		for(i=small;i>=1;i--) {
			if(a%i==0 && b%i==0) break;
		}
		System.out.println("�ִ�����="+i);
		
		//�ּҰ����
		for(i=small;i<=a*b;i++) {
			if(i%a==0 && i%b==0) break;
		}
		System.out.println("�ּҰ����="+i);
	}

}
