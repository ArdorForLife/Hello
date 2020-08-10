package a20_6_29;

import java.util.Scanner;

//숫자를 입력 받아서
//양수이면 "양수", 0이면 "0", 아니면 "음수" 출력되게 해보시오.
public class ch04ex03 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num;
	num=sc.nextInt();
	if(num>0) System.out.println("양수");
	else if(num==0) System.out.println("0");
	else System.out.println("음수");
		
	}
}
