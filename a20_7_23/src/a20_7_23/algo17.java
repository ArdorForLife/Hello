package a20_7_23;


public class algo17 {

	public static void main(String[] args) {
		int a[]= {10,30,15,20,70};
		int i,j,temp;
		for(i=0;i<4;i++) {
			for(j=i+1;j<5;j++) {				//j=i+1 �̱� ������ ������ �ݺ����� i<4��� ������ ���´�.
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(i=0;i<5;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
