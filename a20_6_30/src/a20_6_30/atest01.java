package a20_6_30;

import java.util.Scanner;

//������ ���� �Է¹޾Ƽ�
//�� ���� 3�� ����̸�
//"3�� ���" ����ϰ� �ƴϸ� �������� �Ѵ�
public class atest01 {
	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		int na=num-(num/3)*3;
		if(num%3==0) System.out.println("3�� ���");	// if(na==0) <-�ٷ� ������ ���� ������ if(na==0)���� ��ü�� ���� ����
		
		//na:������
		
		//na=10%3 				
		//na=10-int(10/3)*3			������ %�� �̷��� ���� �Ǵ°��� �ڹٿ����� int�� ���� �� �־ ��
		//na=10-(10/3)*3
		
		//100/6
		//na=100-100/6*6
		//na=100-int(100/6)*6
		
		
	}
}
