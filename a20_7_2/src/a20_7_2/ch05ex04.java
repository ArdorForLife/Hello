package a20_7_2;
//���� for��
public class ch05ex04 {

	public static void main(String[] args) {
		int a,b,cnt=0;
		for(a=1;a<=3;a++) {							//a�� 1�϶� b�� 2��, a�� 2�϶� b�� 2��, a�� 3�϶� b�� 2�� �ؼ� ��6�� ����
			for(b=1;b<=2;b++) {
				System.out.println("��������");
				cnt=cnt+1;
			}
		}
		System.out.println(cnt+"ȸ");
	}

}
