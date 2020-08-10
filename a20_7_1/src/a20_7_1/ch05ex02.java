package a20_7_1;

import java.util.Scanner;

//5회 점수(jumsu)를 입력받아서
//평균(avg)을 구하라
public class ch05ex02
{
	public static void main(String[] args)
	{
		int i,jumsu, sum=0, cnt=0;
		double avg;
		Scanner scanner=new Scanner(System.in);
		
		for(i=1;i<=5;i++)					//이럴 때는 그냥 i를 잡아주고 5번 반복하게 해주는 용도로 사용하는 것임
		{
			jumsu=scanner.nextInt();
			sum=sum+jumsu;
			cnt++;
		}
	avg=(double) sum/cnt;

	System.out.println("합계="+sum);
	System.out.println("횟수="+cnt);
	System.out.println("평균="+avg);
		
	}	

}
