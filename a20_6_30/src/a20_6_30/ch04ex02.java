package a20_6_30;

import java.util.Scanner;

//1을 입력하면 "일요일"
//2을 입력하면 "월요일",7까지 입력하고
//만약에 그 외의 숫자를 입력하면 "에러"출력
public class ch04ex02 {
	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		switch (num) {						//반드시 switch() <- 괄호 안에는 정수변수 또는 정수식이 들어가야만 함.
		case 1:								//case 뒤에 1 부분에는 정수값만 있어야함.
			System.out.println("일요일");
			break;									
		//중간중간 마다 break가 있어야함. break가 없으면 계속 내려가서 break가 나올 때까지의 값이 계속 나옴
		case 2:	System.out.println("월요일"); break;
		case 3:	System.out.println("화요일"); break;
		case 4:	System.out.println("수요일"); break;
		case 5:	System.out.println("목요일"); break;
		case 6:	System.out.println("금요일"); break;
		case 7: System.out.println("토요일"); break;
		default: System.out.println("에러");
		}
		//여기로 나온다
	}
}
