package a20_7_3;
//1+1+2+3+5+8+13+21+34+55
//�Ǻ���ġ ������ 10�ױ����� ��
public class algo9_1 {

	public static void main(String[] args) {
		int a,b,c,y,n;
		a=1; b=1; y=2; n=2;
		do {
			c=a+b;
			y=y+c;
			n=n+1;
			/*if(n<10) {a=b; b=c;}*/	//�̷��� �ᵵ ������ ��Ȯ�Ѱ� �׳� �Ʒ�ó�� ����
			a=b; b=c;
		}while(n<10);
		System.out.println(y);
	}

}
