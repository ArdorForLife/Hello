package a20_7_23;

import java.util.Scanner;

public class algo16 {

	public static void main(String[] args) {
		int jumsu[]=new int[5];
		int rank[]=new int[5];
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("5명의 성적을 입력하세요");
		for(i=0;i<5;i++) {
			jumsu[i]=sc.nextInt();
			rank[i]=1;
		} 
		for(i=0;i<5;i++) {
			for(j=0;j<5;j++) {
				if(jumsu[i]<jumsu[j]) rank[i]=rank[i]+1;
			}
		}
		for(i=0;i<5;i++) {
			System.out.println(jumsu[i]+","+rank[i]);
		}
	}

}
