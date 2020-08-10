package a20_7_8;
//배열에 저장된 값중 가장 큰값을 max에 저장한 후 max를 출력하라
//int a[]={90,88,77,67,89,54,99,30};
//배열에 저장된 값중 가장 작은 값을 min에 저장한 후 min을 출력하라
public class ch06ex02 {
	public static void main(String[] args) {
		int a[]={90,88,77,67,89,54,99,30};
		int len=a.length;					//len=8
		int i;
		//int max=0;						//max 변수에 가장 작은 값을 넣어둔다.
		//int min=9999;						//min 변수에 큰 값을 넣어둔다.
		int max,min;
		max=min=a[0];						//위의 각 변수값을 지정하는것보단 자기들끼리 비교하게 시키는게 좋은 방법이다.
		
		for(i=0;i<len;i++) {
			if(a[i]>max) max=a[i];
			if(a[i]<min) min=a[i];
		}
		System.out.println("최소값="+min);
		System.out.println("최대값="+max);
	}
}