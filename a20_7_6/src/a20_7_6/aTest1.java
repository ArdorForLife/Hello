package a20_7_6;
//1부터 100까지 짝수의 합계
public class aTest1 {
	public static void main(String[] args) {
		int a=0,hap=0;
		do {
			if(a%2==0) hap=hap+a;
			a++;
		}while(a<=100);
		System.out.println(hap);
	}
}