package a20_6_29;

import java.util.Scanner;

//���ڸ� �Է� �޾Ƽ�
//����̸� "���", 0�̸� "0", �ƴϸ� "����" ��µǰ� �غ��ÿ�.
public class ch04ex03 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num;
	num=sc.nextInt();
	if(num>0) System.out.println("���");
	else if(num==0) System.out.println("0");
	else System.out.println("����");
		
	}
}
