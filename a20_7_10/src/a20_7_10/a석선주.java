package a20_7_10;
/** 
(1) 두수(a,b)를 전달받아서 두수의 합계를 구하여 리턴하는 add()메서드 만들기
(2) 한개(a)를 전달받아서 음수이면 -1을 리턴하고, 양수이면 1을 리턴하고 0이면 0을 리턴하는 sign()메서드 만들기
(3) 한개(a)를 전달받아서 음수이든 양수이든 모두 양수로 바꾸어서 리턴하는 abs()메서드 만들기
(4) 한개의 수(a)를 전달받아서 그 수가 소수이면 1을 리턴하고 소수가 아니면 -1을 리턴하는 prime() 메서드 만들기
(5) 숫자(a), 문자(‘+’), 숫자(b)를 전달받아서 ‘+’ 이면 덧셈이 되고  ‘-’이면 뺄셈이 되고, ‘*’이면 곱셈이 되고, ‘/’이면 나눗셈이 되어 그 결과값을 리턴하는 operator() 메서드 만들기
(6) 정수(a,b,c)를 전달받아서 평균(avg)를 구하여 90이상이면 ‘A'리턴하고 80이상이면 ‘B'리턴하고 70이상이면 ’C'리턴하고, 그외는 'F'를 리턴하는 hak()메서드 만들기
(7) 정수(a)를 전달받아서 a의 모든 약수를 구하여 출력하는 primes() 메소드 만들기  단)리턴값을 없음
*/

public class a석선주 {
	
	public static int add(int a, int b)
	{
		int res=0;
		res=a+b;
		return res;
	}
		
	public static int sign(int a)
	{
		int res=0;
		if(a>0) res=1;
		else if(a<0) res=-1;
		return res;
	}
	
	public static int abs(int a)
	{
		int res=0;
		if(a>0) res=a;
		else if(a<0) res=-a;
		return res;
	}
		
	public static int prime(int a)
	{
		int res,i;
		for(i=2;(a%i)!=0;i++) { }
		if(i==a) res=1;
		else res=-1;
		return res;
	}
		
	public static int operator(int a,char c,int b)
	{
		int res=0;
		if(c=='+') res=a+b;
		if(c=='-') res=a-b;
		if(c=='*') res=a*b;
		if(c=='/') res=a/b;
		return res;
	}
		
	public static char hak(int a,int b,int c)
	{
		char res;
		int avg=((a+b+c)/3);
		if(avg>=90) res='A';
		else if(avg>=80) res='B';
		else if(avg>=70) res='C';
		else res='F';
		return res;
	}
	
	public static void primes(int a)
	{
		int i;
		for(i=1;i<=a;i++) 
		{
			if(a%i==0) System.out.print(i+"\t");
		}
	}
	
	public static void main(String[] args) {
		System.out.println(add(10,20));
		System.out.println(sign(-5));
		System.out.println(abs(-7));
		System.out.println(prime(4));
		System.out.println(operator(7,'*',9));
		System.out.println(hak(100,100,91));
		primes(12);
	}

}
