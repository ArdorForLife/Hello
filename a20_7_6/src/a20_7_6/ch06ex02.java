package a20_7_6;

import java.util.Scanner;

//a�迭�� ��ĳ�ʸ� �̿��Ͽ� 5���� �����͸� �Է¹޾Ƽ�
//�迭�� ����� ���� ��� ����ϰ�
//�迭�� ��� ���� �հ踦 ����϶�
public class ch06ex02 {
	public static void main(String[] args) {
		int a[]=new int[5];
		int sum=0;
		int i;
		Scanner sc=new Scanner(System.in);
		for(i=0;i<5;i++) {
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		for(i=0;i<5;i++) {
			System.out.println(a[i]);
		}
		System.out.println("�հ�="+sum);	
	}
		
}
