package kmv2;
//1)SelectSort()									//오름차순
//2)SelectSort_R()									//내림차순
//3)BubbleSort() 									//오름차순
public class study1 {
	
	/*public void swap(int x, int y) {
		int temp;
		temp=x;
		x=y;
		y=temp;
	}*/
	
	public void SelectSort(int a[]) {
		int i,j;
		int len=a.length;
		int temp;
		for(i=0;i<len-1;i++) {
			for(j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					//swap(a[i],a[j]);				//이렇게 하면 java에서는 교체가 되지 않는다!!
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}
	
	public void SelectSort_R(int a[]) {
		int i,j;
		int len=a.length;
		int temp;
		for(i=0;i<len-1;i++) {
			for(j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}
	
	public void BubbleSort(int a[]) {					//오름차순
		int i,j;
		int len=a.length;
		int temp;
		for(i=0;i<len-1;i++) {
			for(j=i+1;j<(len-1)-i;j++) {					//bubblesort의 특징은 뒤에 기점이 있다. 즉 j<len-i <- len-i 이것!
				if(a[j]>a[j+1]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}
	
	public void BubbleSort_R(int a[]) {					//내림차순
		int i,j;
		int len=a.length;
		int temp;
		for(i=0;i<len-1;i++) {
			for(j=i+1;j<len-i;j++) {					//bubblesort의 특징은 뒤에 기점이 있다. 즉 j<len-i <- len-i 이것!
				if(a[j]<a[j+1]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}
	
	public void arr_prn(int a[]) {
		int i;
		int len=a.length;
		for(i=0;i<len;i++) {
			System.out.println(a[i]);
		}
	}
	
	public boolean BinarySearch(int a[], int key) {
		int len=a.length;
		int l=0;
		int h=a.length-1;
		int m=0;
		while(l<=h) {
			m=(l+h)/2;
			if(key==a[m]) break;
			if(key<a[m]) h=m-1;
			else l=m+1;
		}
		if(l>h) return false;
		else return true;
	}
}
