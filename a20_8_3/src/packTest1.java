import kr.co.babo.*;						//�ٸ� ��Ű���� ���� ������ ���� �̷��� ��Ű���� Ŭ�������� import������Ѵ�.
import java.lang.*;							//��Ű����.* ���� �ϸ� �� ��Ű�� �ȿ� �ִ� ��� Ŭ������ import�Ѵٴ� ����.

public class packTest1 {

	public static void main(String[] args) {
		Point p=new Point();					//�̴�� �θ� error�� ��
		//kr.co.babo.Point p=new kr.co.babo.Point();	//�̷��Ե� ���������� �ʹ� ��ȿ�����̶� ���� import�� ���°� ����
		String name="ȫ�浿";					//������ ���
		String name2=new String("�̱���");	//������ ���
		java.lang.String name3=new java.lang.String("����");		//�̷��� ����������� �̰͵� import�ϴ°� �´�.
																	//�׷���! java.lang�� import���ص� �ڵ����� �ȴ�. �ڵ����� ���ԵǱ� ����.
	}
}
