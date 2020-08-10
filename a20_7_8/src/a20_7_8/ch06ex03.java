package a20_7_8;
//전체 배열의 합계와 평균을 구하시오
public class ch06ex03 {
	public static void main(String[] args) {
		int a[]= {90,88,77,67,89,54,99,30};
		int len=a.length;
		int i;
		int hap=0;
		for(i=0;i<len;i++) {
			hap=hap+a[i];
		}
		double avg=hap/len;
		System.out.println("합계="+hap);
		System.out.println("평균="+avg);
		
	}
}