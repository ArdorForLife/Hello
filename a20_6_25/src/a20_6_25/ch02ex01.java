package a20_6_25;
public class ch02ex01 {
	public static void main(String[] args) {
		int kor,eng,mat,tot;  //������(�Ҽ��� ����)
		double avg;			  //�Ǽ���(�Ҽ����� �ִ� ��)
		kor=100;
		eng=100;
		mat=90;
		tot=kor+eng+mat; 	  //
		avg=tot/3.0;		  //tot�� 3���� ������ ������ ������ �������̶� 96���� ����������Թۿ� ǥ�� ����. �׷��� 3.0���� �Ǽ������� ǥ�����ָ� ���� ��Ȯ�ϰ� 96.6666666...���� ����
		System.out.println(avg);
	}
}
