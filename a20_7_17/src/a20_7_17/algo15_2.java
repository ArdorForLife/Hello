package a20_7_17;

import java.util.Scanner;

public class algo15_2 {
	public static void main(String[] args) {
		int dec;
		Scanner sc=new Scanner(System.in);
		dec=sc.nextInt();
		int array_size=10;
		int cnt=0;
		int mok,nmg,subscript;
		int bin[]=new int[array_size];
		do {
			mok=dec/2;
			nmg=dec-mok*2;
			cnt++;
			subscript=array_size-cnt;
			bin[subscript]=nmg;
			dec=mok;
		}while(mok!=0);
		for(int i=0;i<array_size;i++)
		{
			System.out.print(bin[i]+" ");
		}
	}
	
}
