package a20_7_29;

import java.util.Scanner;

import javax.swing.border.SoftBevelBorder;

public class stringbufferTest {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		Scanner sc=new Scanner(System.in);
		String name;
		for(int i=0;i<5;i++) {
			name=sc.next();					//next() �������� �о��
			sb.append(name);				//append() ��ɾ� �߰��϶�
		}
		System.out.println(sb);
		sb.append('r');
		sb.append(10.5);
		sb.append("korea");
		sb.append(90);						//� ����,����,�Ǽ� �� �� �߰��ȴ�
		System.out.println(sb);
		sb.insert(9,  ",bbb");				//9��° ���� �ڿ� ,bbb�� �����϶�
		System.out.println(sb);
		sb.reverse();						//���ڿ��� ������ ������ �������
		System.out.println(sb);
	}

}
