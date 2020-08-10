 package a20_7_17;

import java.util.Scanner;

public class algo14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,high,low,r=1,l;
		a=sc.nextInt();
		b=sc.nextInt();
		if(a>b) {high=a; low=b;}
		else {low=a; high=b;}
		do {
			r=(high%low);
			low=r;
		}while(r>0);
		l=(a*b)/high;
		System.out.println("최대공약수="+high+","+"최소공배수="+l);
	}

}
