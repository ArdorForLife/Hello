package a20_7_3;
//4와 6의 최대공약수, 최소공배수 구하기
public class ch05Test4 {

	public static void main(String[] args) {
		//최대공약수
		int a=4,b=6,i,small;
		
		small=(a>b)?b : a;				//a가 b보다 크냐? 그러면 b를 넣고 아니면 a를 넣어라
		
		for(i=small;i>=1;i--) {
			if(a%i==0 && b%i==0) break;
		}
		System.out.println("최대공약수="+i);
		
		//최소공배수
		for(i=small;i<=a*b;i++) {
			if(i%a==0 && i%b==0) break;
		}
		System.out.println("최소공배수="+i);
	}

}
