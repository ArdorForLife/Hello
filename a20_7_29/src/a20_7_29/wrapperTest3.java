package a20_7_29;
//10 +-*/ 5 
public class wrapperTest3 
{
	public static void main(String[] args)		//(String[] args)->stringŸ���� args�迭 �� ����. �̰� ���� �Ķ��Ÿ�� 
	{
		//System.out.println(args[0]);
		//System.out.println(args[1]);			//run configurations -> arguments -> program arguments�� ���� ����� �����ؼ� �Է��ؼ� run�ϸ� ���� ����ȴ�.
		
		String num1=args[0];
		String op=args[1];
		String num2=args[2];
		int n1,n2,c=0;
		char ch;
		n1=Integer.valueOf(num1);
		n2=Integer.valueOf(num2);
		for(int i=0;i<4;i++) {
		ch=op.charAt(i);			//op������ i��° �ѱ���
		
		switch (ch) {
		case '+':
			c=n1+n2;
			break;
		case '-':
			c=n1-n2;
			break;
		case '*':
			c=n1*n2;
			break;
		case '/':
			c=n1/n2;
			break;
		default:
			break;
		}
		
		System.out.println(c);
		}
		
	}
}

