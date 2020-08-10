package a20_7_24;

import java.util.Scanner;

public class algo18 {
	public static void main(String[] args) {
		int a[]= {10,30,15,20,70};
		int i,j,temp;
		for(i=1;i<a.length;i++) {					//i는 1,2,3,4같은 버블의 step을 의미한다
			for(j=0;j<a.length-i;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			
		}
		for(i=0;i<5;i++) {
			System.out.println(a[i]);
		}
	}
}
