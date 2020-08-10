package a20_7_24;

public class algo19 {

	public static void main(String[] args) {
		int i,j,k;
		
		int a[]= {1,3,7,9,10};
		int b[]= {2,4,7,11,13};
		
		int n=a.length;
		int m=b.length;
		
		int c[]=new int[n+m];
		
		for (int ci=0;ci<n+m;ci++) {
			if(a[i]>b[j]) {
				c[k++]=a[i++];
			} else if(a[i]<b[j]) {
				c[k++]=b[j++];
			} else {
				c[k++]=a[i++];
				j++;
			}
			if(i>n) {
				for(int jb=j;jb<m;jb++) {
					c[k++]=b[jb];
				}
				break;
				
			} else if(j>m) {
				for(int ia=i;ia<n;ia++) {
					c[k++]=b[ia];
				}
				break;
			}
		}
		for(int c=0;c<n+m;c++) {
			System.out.println(c[k]);
		}
	}

}
