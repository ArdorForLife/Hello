package a20_7_7;

import java.util.Scanner;

public class algo11_1 {
	public static void main(String[] args) {
		int a[]=new int[100];
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
		int c=0;
		int d=0;
		do {
			c++;
			if(b%c==0) {
				a[d]=c;			//������ ������ �ٸ���. a[d]=c; d++; �� ������ �ٸ���. �ֳĸ� ������ algo�̶� 1���� �����̰� java�� 0���� �����̶� d++�� �̸��ع����� a[0]���� ���� ��Եȴ� �׷��� ���� a[0]���� ä�� �Ŀ� a[1]�� ������ �÷��������Ѵ�.
				d++;
			}
			
		}while(c<=b);			//do while .. end
		
		for(int i=0;i<d;i++) {
			System.out.println(a[i]);
		}
			
		
	}

}
