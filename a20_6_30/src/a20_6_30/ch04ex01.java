package a20_6_30;
//�̸�(name),����(kor),����(mat),����(eng)
//�Է¹޾Ƽ� �̸��� ����(tot)�� ���(avg)�� ���Ͻÿ�
//����� 60�� �̻��̰� ��� ������ 40�� �̻��̸� "�հ�" �ƴϸ� "���հ�"
import java.util.Scanner;

public class ch04ex01 {

	public static void main(String[] args) {
		String name;
		int kor,mat,eng,tot;
		double avg;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ���");
		name=sc.next();			//���ڿ� �Է�-int���� next��
		System.out.println("����,����,���� ������ �Է��ϼ���");
		kor=sc.nextInt();		//���� �Է�   -int�ְ�
		mat=sc.nextInt();
		eng=sc.nextInt();
		
		tot=kor+mat+eng;
		avg=(double)tot/3;
		System.out.println(name);
		System.out.println(tot);
		System.out.println(avg);

		if(avg>=60 && kor>=40 && mat>=40 && eng>=40) System.out.println("�հ�");
		else System.out.println("���հ�");
		
		//if(avg<60 || kor<40 || mat<40 || eng<40) System.out.printIn("���հ�");
		//else System.out.printIn("�հ�");
		
		//if(avg>=60) if(kor>=40) if(mat>=40) if(eng>=40) <-���� &&�� ���� �����̶�� �����ϸ� ��
	}
}
