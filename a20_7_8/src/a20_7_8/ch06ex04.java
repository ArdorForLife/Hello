package a20_7_8;

public class ch06ex04 {
	public static void main(String[] args) {
		int a[][]=new int[5][3];
		//a[0][0]=10;		//�翬�� �̷������� ���ϰ���
		//a[0][1]=20;
		
		int i,j,cnt=0;
		
		for(i=0;i<5;i++) {
			for(j=0;j<3;j++) {
				cnt++;				//����
				a[i][j]=cnt;
			}
		}
		for(i=0;i<5;i++) {
			for(j=0;j<3;j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}
}