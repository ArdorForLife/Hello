package a20_7_23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class keyboardTest2 {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr=new InputStreamReader(System.in);				//scanner�� ��ɻ� ���� ���ٰ� ���� ��. �׷��� scanner�� ���� �Ǵµ� �ٸ� ����(ä�����α׷� ����) ������
		BufferedReader in=new BufferedReader(isr);							//�� ��ɵ� �������ƾ��� �׸��� scanner�� ����,���� �پ��ϰ� �����ϳ� �� ����� ���ڿ��� ����.
		System.out.println("�۾��� �Է��ϸ� �����մϴ�.");
		String str=in.readLine();
		System.out.println(str);
		
		
	}
		//isr�� Ű���� a�Է��� ���
		//a�� (byte) --> ���ڷ� ���� --> ���۰� ����(�Է��ϴ� �͵��� ������ ä�� �ϳ��ϳ� �� �Է��� ��)
}
