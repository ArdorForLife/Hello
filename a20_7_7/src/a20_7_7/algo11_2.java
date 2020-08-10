package a20_7_7;

public class algo11_2 {
	public static void main(String[] args) {
		int lm=0;
		int n;
		int k;
		int j;
		int sum;
		for(n=4;n<=1000000000;n++) {
			sum=0;
			k=n/2;
			for(j=1;j<=k;j++) {
				if(n%j==0) sum=sum+j;
			}
			if(n==sum) {
				System.out.println(n);
				lm++;
			}
		}
		System.out.println("°¹¼ö="+lm);
	}

}
