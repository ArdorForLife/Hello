package a20_7_3;
/*
 | 
*******
******
*****
****
***
**
**
|
*/
public class ch05Test2 {

	public static void main(String[] args) {
		int a,b,k;
		for(a=7;a>=1;a--) {
			if(a<=2) k=2;						//����� �������� �ʿ��ϴ�
			else k=a;							//������ �������� �����ϸ� ���� �� �ȳ����� �׷��ٸ� �ٸ� ������ �� �� �ִ��� ã�ƺ���
			for(b=1;b<=k;b++) {
				System.out.print("*");
			}System.out.println();
		}
	}

}
