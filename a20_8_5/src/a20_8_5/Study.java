package a20_8_5;

public class Study {
	public static void poly(Shape sh) {
		if(sh instanceof Circle ) {				//����Ŭ������ 3���̱� ������ �̷������� �ؾ���
			Circle cx=(Circle) sh;				//�̷������� �ٿ�ĳ��Ʈ �ؾ���
			cx.setR(5);
			cx.area();
			cx.show();
		}
		else if (sh instanceof Rectangle) {
			Rectangle rx=(Rectangle) sh;
			rx.setW(5);
			rx.setH(10);
			rx.area();
			rx.show();
		}
		else if (sh instanceof Triangle) {
			Triangle tx=(Triangle) sh;
			tx.setW(5);
			tx.setH(10);
			tx.area();
			tx.show();
		}
	}
}
