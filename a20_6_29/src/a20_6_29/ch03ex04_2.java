package a20_6_29;

import java.util.Scanner;

public class ch03ex04_2 {
	public static void main(String[] args) {
		int a,b,c,max;
		Scanner sc=new Scanner(System.in);			//��ġ�� ctrl + shift + O ������ ���� import �κ� �ڵ� �Էµ�
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
													//run ��Ű�� console�κ� ����~~~~�ʿ� ������ �׸� �Ǹ� �׶����� consoleâ�� ���� �Է��ϸ� �� a,b,c�� ���� ������ �ǹ�����.
													//�� ��ĵ ���� ���ͷ� �ص� �ǰ� �����̽��ٷ� �ص� ������ �ȴ�. ������ sysout�κ��� ���� ���ָ� �ؿ� max�� 2�� ����Ǽ� sysout �ǹ�����.
		max=(a>b)?a:b;
		max=(max>c)?max:c;
		System.out.println("�ִ밪="+max);
		
	}
}
