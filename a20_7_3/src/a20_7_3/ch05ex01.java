package a20_7_3;

public class ch05ex01 {

	public static void main(String[] args) {
		int i;
		for(i=1;i<=10;i++) {
			if(i%3==0) break;
			System.out.println(i);				//1 ��� 2 ��� 3�� ����� �Ǿ������ �ٷ� break; �� ���� sysout�� ����� �ݺ����� ��������
		}
		for(i=1;i<=10;i++) {
			if(i%3==0) continue;				//1 ��� 2 ��� 3�� ����� �Ǿ������ �ٷ� continue; �� ���� sysout�� ����� �ٽ� if������ ���ư�
			System.out.println(i);
		}
		
	}

}
