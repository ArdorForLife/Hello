package a20_7_10;

public class a���� {
	//(1) �μ�(a,b)�� ���޹޾Ƽ� �μ��� �հ踦 ���Ͽ� �����ϴ� add()�޼��� �����
	public static int add(int a, int b)
	{
		int res=a+b;
		return res;
	}
	
	//(2) �Ѱ�(a)�� ���޹޾Ƽ� �����̸� -1�� �����ϰ�, ����̸� 1�� �����ϰ� 0�̸� 0�� �����ϴ� sign()�޼��� �����	
	public static int sign(int a)
	{
		int res=0;
		if(a>0) res=1;
		else if(a<0) res=-1;
		return res;
	}
	
	//(3) �Ѱ�(a)�� ���޹޾Ƽ� �����̵� ����̵� ��� ����� �ٲپ �����ϴ� abs()�޼��� �����
	public static int abs(int a)
	{
		int res=0;
		if(a>0) res=a;
		else if(a<0) res=-a;
		return res;
	}
		
	//(4) �Ѱ��� ��(a)�� ���޹޾Ƽ� �� ���� �Ҽ��̸� 1�� �����ϰ� �Ҽ��� �ƴϸ� -1�� �����ϴ� prime() �޼��� �����
	public static int prime(int a)
	{
		int i;
		int cnt=0;
		for(i=1;i<=a;i++) {if(a%i==0) cnt++;}
		if(cnt==2) return 1;
		return -1;
	}
		
	//(5) ����(a), ����(��+��), ����(b)�� ���޹޾Ƽ� ��+�� �̸� ������ �ǰ�  ��-���̸� ������ �ǰ�, ��*���̸� ������ �ǰ�, ��/���̸� �������� �Ǿ� �� ������� �����ϴ� operator() �޼��� �����
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
		
	//(6) ����(a,b,c)�� ���޹޾Ƽ� ���(avg)�� ���Ͽ� 90�̻��̸� ��A'�����ϰ� 80�̻��̸� ��B'�����ϰ� 70�̻��̸� ��C'�����ϰ�, �׿ܴ� 'F'�� �����ϴ� hak()�޼��� �����
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
	
	//(7) ����(a)�� ���޹޾Ƽ� a�� ��� ����� ���Ͽ� ����ϴ� primes() �޼ҵ� �����  ��)���ϰ��� ����
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
		System.out.println("1��="+add(10,50));
		System.out.println("2��="+sign(-10));
		System.out.println("3��="+abs(-10));
		System.out.println("4��="+prime(7));
		System.out.println("5��="+operator(10,'+',20));
		System.out.println("6��="+hak(100,90,78));
		System.out.print("7��=");primes(12);
	}

}
