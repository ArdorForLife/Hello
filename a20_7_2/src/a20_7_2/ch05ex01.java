package a20_7_2;
//1부터 100까지 출력(while)
//그 합계를 구하시오
//5의 배수의 갯수를 구하시오
public class ch05ex01 {

	public static void main(String[] args) {
		int a,sum,cnt;
		a=1;								//초기값
		sum=0;
		cnt=0;
		while(a<=100) {						//조건		//괄호안의 조건이 맞다면 중괄호 안을 실행하고 다시 while을 반복하라
			System.out.println(a);
			sum=sum+a;
			a++;							//1씩 증가
			if(a-(a/5)*5==0) cnt++;
			}
		System.out.println("전체합계="+sum);
		System.out.println("5의 배수의 갯수="+cnt);
		
	}

}
