package a20_7_10;

public class a정답 {
	//(1) 두수(a,b)를 전달받아서 두수의 합계를 구하여 리턴하는 add()메서드 만들기
	public static int add(int a, int b)
	{
		int res=a+b;
		return res;
	}
	
	//(2) 한개(a)를 전달받아서 음수이면 -1을 리턴하고, 양수이면 1을 리턴하고 0이면 0을 리턴하는 sign()메서드 만들기	
	public static int sign(int a)
	{
		int res=0;
		if(a>0) res=1;
		else if(a<0) res=-1;
		return res;
	}
	
	//(3) 한개(a)를 전달받아서 음수이든 양수이든 모두 양수로 바꾸어서 리턴하는 abs()메서드 만들기
	public static int abs(int a)
	{
		int res=0;
		if(a>0) res=a;
		else if(a<0) res=-a;
		return res;
	}
		
	//(4) 한개의 수(a)를 전달받아서 그 수가 소수이면 1을 리턴하고 소수가 아니면 -1을 리턴하는 prime() 메서드 만들기
	public static int prime(int a)
	{
		int i;
		int cnt=0;
		for(i=1;i<=a;i++) {if(a%i==0) cnt++;}
		if(cnt==2) return 1;
		return -1;
	}
		
	//(5) 숫자(a), 문자(‘+’), 숫자(b)를 전달받아서 ‘+’ 이면 덧셈이 되고  ‘-’이면 뺄셈이 되고, ‘*’이면 곱셈이 되고, ‘/’이면 나눗셈이 되어 그 결과값을 리턴하는 operator() 메서드 만들기
	public static int operator(int a,char op,int b)
	{
		int res=0;
		switch (op) {
		case '+': res=a+b; break;
		case '-': res=a-b; break;
		case '*': res=a*b; break;
		case '/': res=a/b; break;
		}
		return res;
	}
		
	//(6) 정수(a,b,c)를 전달받아서 평균(avg)를 구하여 90이상이면 ‘A'리턴하고 80이상이면 ‘B'리턴하고 70이상이면 ’C'리턴하고, 그외는 'F'를 리턴하는 hak()메서드 만들기
	public static char hak(int a,int b,int c)
	{
		double avg;
		char temp;
		avg=(a+b+c)/3.0;
		if(avg>=90) temp='A';
		else if(avg>=80) temp='B';
		else if(avg>=70) temp='C';
		else temp='F';
		return temp;
	}
	
	//(7) 정수(a)를 전달받아서 a의 모든 약수를 구하여 출력하는 primes() 메소드 만들기  단)리턴값을 없음
	public static void primes(int a)
	{
		int num[]=new int[a];
		int cn=0;
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				num[cn]=i;
				cn++;
			}
		}
		for(int i=0;i<cn;i++) {
			System.out.print(num[i]+"  ");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("1번="+add(10,50));
		System.out.println("2번="+sign(-10));
		System.out.println("3번="+abs(-10));
		System.out.println("4번="+prime(7));
		System.out.println("5번="+operator(10,'+',20));
		System.out.println("6번="+hak(100,90,78));
		System.out.print("7번=");primes(12);
	}

}
