package a20_7_16;

import java.util.Scanner;

public class algo13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,nmg,gcm,lcm,big,small;
		a=sc.nextInt();
		b=sc.nextInt();
		if(a>=b) {
			big=a;
			small=a;
		}
		else {
			big=b;
			small=a;
		}
		nmg=big%small;
		while(nmg!=0) {
			big=small;
			small=nmg;
			nmg=big%small;
		}
		gcm=small;
		lcm=(a*b)/gcm;
		System.out.println("최대공약수="+gcm);
		System.out.println("최소공배수="+lcm);
	}

}
