package test3;

public class MaxTest {

		public static int max(int x, int y) {
			int ma;
			if(x>y) ma=x;
			else ma=y;
			return ma;
			
		}
		
		public static void main(String[] args) {
			String num1=args[0]; //���ڿ� 
			String num2=args[1]; //���ڿ�
			
			int n1=Integer.valueOf(num1);
			int n2=Integer.valueOf(num2);
			
			int res=max(n1, n2);
			System.out.println("�ִ밪="+res);
		}
}