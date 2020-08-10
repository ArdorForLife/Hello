package a20_7_13;

import java.util.Scanner;

public class alg012 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=0;
		int k;
		int s[]=new int[100];
		while(n>=2) 
		{
		c=0;
		do {
			k=2;
			while(n%k !=0 ) k++;
			s[c]=k;
			c++;
			n=n/k;
			}while(n!=1);
		if(c!=1) {
					for(int y=0;y<c-1;y++) {
						System.out.print(s[y]+"*");
					}
					System.out.println(s[c-1]);
					break;
		}
		System.out.println("¼Ò¼ö");
		}
	}
}
