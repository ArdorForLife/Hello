package a20_7_3;

public class algo8_1 {

	public static void main(String[] args) {
		double i=0,h=0;				//ALGO������ �ϸ� int �������̸� 0�̱� ������ double���� �ؾ��Ѵ�.
		do {
			i++;
			h=h+(i/(i+1));
			
		}while(i<49);
		System.out.println(h);
	}

}
