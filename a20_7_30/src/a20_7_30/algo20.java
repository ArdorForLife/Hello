package a20_7_30;

import java.util.Scanner;

public class algo20 {

	public static void main(String[] args) {
		int A[]= {10,20,30,40,50,60,70,80,90,100};
		int M,L,H,K;
		L=1;
		H=10;
		M=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("찾을값을 입력하세요");
		K=sc.nextInt();
		
		while(L<=H) {
			M=(L+H)/2;
			if(K==A[M]) break;
			if(K<A[M]) {H=M-1;}
			else L=M+1;
		}
		if(L>H) System.out.println("값을 찾을 수 없네요");
		else System.out.println(M+"위치에서 찾음");
		
	}

}
