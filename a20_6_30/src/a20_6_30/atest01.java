package a20_6_30;

import java.util.Scanner;

//임의의 수를 입력받아서
//그 수가 3의 배수이면
//"3의 배수" 출력하고 아니면 끝나도록 한다
public class atest01 {
	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		int na=num-(num/3)*3;
		if(num%3==0) System.out.println("3의 배수");	// if(na==0) <-바로 윗줄의 선언 때문에 if(na==0)으로 대체할 수도 있음
		
		//na:나머지
		
		//na=10%3 				
		//na=10-int(10/3)*3			원래는 %가 이렇게 연산 되는거임 자바에서는 int는 굳이 안 넣어도 됨
		//na=10-(10/3)*3
		
		//100/6
		//na=100-100/6*6
		//na=100-int(100/6)*6
		
		
	}
}
