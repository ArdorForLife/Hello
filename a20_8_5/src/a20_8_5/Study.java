package a20_8_5;

public class Study {
	public static void poly(Shape sh) {
		if(sh instanceof Circle ) {				//서브클래스가 3개이기 때문에 이런식으로 해야함
			Circle cx=(Circle) sh;				//이런식으로 다운캐스트 해야함
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
