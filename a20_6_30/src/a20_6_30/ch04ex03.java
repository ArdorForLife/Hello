package a20_6_30;
//����� ���ϰ�, ����� 90�̻��̸� "A����"
//����� 80�̻��̸� "B����"
//����� 70�̻��̸� "C����"
//����� 60�̻��̸� "D����"
//�� �� "F����"
public class ch04ex03 {

	public static void main(String[] args) {
		int kor=100,mat=60,eng=65;
		int avg;
		avg=(kor+mat+eng)/3;
		
		switch (avg/10) {					//switch���� ��ȣ�� ���ǽ��� �����ϴ� ���� ������ ��ȣ�� ���� �������� ����� �� ����. �׳� ���� ���̾�� �Ѵ�.�׷��� �׳� (avg) �ϰ� ���� case�� 100,99,98,97... �̷������� �ϳ��ϳ� ���� �Է��ؾ� ��
		case 10:							//�׷��� �ٲ۴�. avg/10���� �ٲ㼭 ���� ������ ���°����� �ϸ� ����������
		case 9:								//case 10: ���θ� �������� �� ��� ���� ������ ������ A�����̾ �׳� �״�� �귯������ �Ǳ� ������ sysout�� break�� ���� �ʾҴ�.
			System.out.println("A����"); 	break;
		case 8:	System.out.println("B����"); 	break;
		case 7: System.out.println("C����"); 	break;
		case 6:	System.out.println("D����"); 	break;
		default: System.out.println("F����"); //���� ���������� break;�� �� �ᵵ �Ǳ� �Ѵ�.
		}
		
		
	}

}
