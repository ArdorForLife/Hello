package a20_7_6;

import java.util.Scanner;

//a배열에 스캐너를 이용하여 5개의 데이터를 입력받아서
//배열에 저장된 값을 모두 출력하고
//배열의 모든 값의 합계를 출력하라
public class ch06ex02 {
	public static void main(String[] args) {
		int a[]=new int[5];
		int sum=0;
		int i;
		Scanner sc=new Scanner(System.in);
		for(i=0;i<5;i++) {
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		for(i=0;i<5;i++) {
			System.out.println(a[i]);
		}
		System.out.println("합계="+sum);	
	}
		
}
