package a20_7_7;

import java.util.Scanner;

public class algo11_1 {
	public static void main(String[] args) {
		int a[]=new int[100];
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
		int c=0;
		int d=0;
		do {
			c++;
			if(b%c==0) {
				a[d]=c;			//용지와 순서가 다르다. a[d]=c; d++; 의 순서가 다르다. 왜냐면 용지는 algo이라서 1부터 시작이고 java는 0부터 시작이라서 d++을 미리해버리면 a[0]방의 값이 비게된다 그래서 먼저 a[0]방을 채운 후에 a[1]방 식으로 늘려나가야한다.
				d++;
			}
			
		}while(c<=b);			//do while .. end
		
		for(int i=0;i<d;i++) {
			System.out.println(a[i]);
		}
			
		
	}

}
