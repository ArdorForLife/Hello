package a20_7_10;
/** 
(1) �μ�(a,b)�� ���޹޾Ƽ� �μ��� �հ踦 ���Ͽ� �����ϴ� add()�޼��� �����
(2) �Ѱ�(a)�� ���޹޾Ƽ� �����̸� -1�� �����ϰ�, ����̸� 1�� �����ϰ� 0�̸� 0�� �����ϴ� sign()�޼��� �����
(3) �Ѱ�(a)�� ���޹޾Ƽ� �����̵� ����̵� ��� ����� �ٲپ �����ϴ� abs()�޼��� �����
(4) �Ѱ��� ��(a)�� ���޹޾Ƽ� �� ���� �Ҽ��̸� 1�� �����ϰ� �Ҽ��� �ƴϸ� -1�� �����ϴ� prime() �޼��� �����
(5) ����(a), ����(��+��), ����(b)�� ���޹޾Ƽ� ��+�� �̸� ������ �ǰ�  ��-���̸� ������ �ǰ�, ��*���̸� ������ �ǰ�, ��/���̸� �������� �Ǿ� �� ������� �����ϴ� operator() �޼��� �����
(6) ����(a,b,c)�� ���޹޾Ƽ� ���(avg)�� ���Ͽ� 90�̻��̸� ��A'�����ϰ� 80�̻��̸� ��B'�����ϰ� 70�̻��̸� ��C'�����ϰ�, �׿ܴ� 'F'�� �����ϴ� hak()�޼��� �����
(7) ����(a)�� ���޹޾Ƽ� a�� ��� ����� ���Ͽ� ����ϴ� primes() �޼ҵ� �����  ��)���ϰ��� ����
*/

public class a������ {
	
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
