package a20_7_17;

import java.util.Scanner;

public class algo15 {

	public static void main(String[] args) {
		int B[]=new int[10];
		int S=0;
		int D,MOK,NMG;
		Scanner sc=new Scanner(System.in);
		D=sc.nextInt();
		do {
			MOK=D/2;
			NMG=D-MOK*2;
			B[S]=NMG;
			S++;
			D=MOK;
		}while(MOK!=0);
		for(int I=S-1;I>=0;I--) {
			System.out.println(B[I]+" ");
		}
		
	}

}
