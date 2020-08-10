package a20_7_6;

import java.util.Scanner;

public class ch06ex03 {
	public static void main(String[] args) {
		int jumsu[]=new int[10]; //빈방 10개
		int i,sum=0;
		/*
		jumsu[0]=100;
		jumsu[1]=90;
		jumsu[2]=80;
		jumsu[3]=90;
		jumsu[4]=100;
		jumsu[5]=77;
		jumsu[6]=60;
		jumsu[7]=99;
		jumsu[8]=88;
		jumsu[9]=100;
		이렇게 하나하나 다 치고 하나하나 다 더할거니??? 노노노!
		*///sum=jumsu[0]+jumsu[1]+jumsu[2]+...+jumsu[9]; <- NONONONONONONO
	
	/*	jumsu[0]=sc.nextInt();
		jumsu[1]=sc.nextInt();
		jumsu[2]=sc.nextInt();
		jumsu[3]=sc.nextInt();
		jumsu[4]=sc.nextInt();
		jumsu[5]=sc.nextInt();
		jumsu[6]=sc.nextInt();
		jumsu[7]=sc.nextInt();
		jumsu[8]=sc.nextInt();
		jumsu[9]=sc.nextInt();*/	//이것도 무식하잖아!!
		
		Scanner sc=new Scanner(System.in);
		for(i=0;i<10;i++) {
		jumsu[i]=sc.nextInt();
		sum=sum+jumsu[i];
		}System.out.println(sum);
	}

}
