package a20_7_1;
//a가 1부터 100까지 1씩 증가하되
//만약 a%3==0이면 a가 3의 배수이다
//3의 배수의 합계(sum)와 갯수(cn)를 구하시오
public class ch05ex01
{
	public static void main(String[] args) 
	{
		int a,na,sum,cn;
		sum=0;cn=0;
		for(a=1;a<=100;a++)
		{
			na=a%3;							//na=a-(a/3)*3;
			if(na==0)						//if문법에 여러 문장을 넣고 싶으면 중괄호를 넣는다. 
			{
				sum=sum+a; cn++;
			}
		}
		System.out.println(sum);
		System.out.println(cn+"개");
		System.out.println((double) sum/cn);
	}
}
