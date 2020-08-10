package a20_6_29;

import java.util.Scanner;

public class ch03ex04_2 {
	public static void main(String[] args) {
		int a,b,c,max;
		Scanner sc=new Scanner(System.in);			//다치고 ctrl + shift + O 누르면 위에 import 부분 자동 입력됨
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
													//run 시키고 console부분 오른~~~~쪽에 빨간색 네모가 되면 그때부터 console창에 값을 입력하면 각 a,b,c에 값이 지정이 되버린다.
													//각 스캔 값을 엔터로 해도 되고 스페이스바로 해도 구분이 된다. 마지막 sysout부분은 엔터 쳐주면 밑에 max도 2번 연산되서 sysout 되버린다.
		max=(a>b)?a:b;
		max=(max>c)?max:c;
		System.out.println("최대값="+max);
		
	}
}
