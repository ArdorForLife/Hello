package a20_6_29;

import java.util.Scanner;

//문제) 점수를 입력받아서
//90점 이상이면 "A학점", 80점 이상이면 "B학점"
//70점 이상이면 "C학점", 60점 이상이면 "D학점"
//그 외는 "F학점" 출력되도록 하시오
public class ch04ex02 {
	public static void main(String[] args) {
		int jumsu;
		Scanner sc=new Scanner(System.in);
		jumsu=sc.nextInt();
		
		if(jumsu>=90) System.out.println("A학점");
		else if(jumsu>=80) System.out.println("B학점");
		else if(jumsu>=70) System.out.println("C학점");
		else if(jumsu>=60) System.out.println("D학점");
		else System.out.println("F학점");
		System.out.println("끝");
			
		
	}
}
