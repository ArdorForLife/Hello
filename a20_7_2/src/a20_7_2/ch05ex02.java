package a20_7_2;

public class ch05ex02 {

	public static void main(String[] args) {
		int i;
		i=1;
		while(true) {					//true�̸� �ݺ��ϴ� while�����̱� ������ ���ѹݺ��ȴ�. for(;;)�� ����. server
			System.out.println(i);
			if(i>=10) break;			//break�� ���� ����� �ݺ����� ���������� ��.
			i++;
		}
	}

}
