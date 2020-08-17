
public class abMain {

	
	public static void main(String[] args) {
		 //Shape a = new Shape();				//X 추상클래스는 new가 안된다.
		Circle c = new Circle();				// Shape c = new Circle(); 을 해도 가능하다. 추상클래스 이긴하지만 그래도 부모클래스는 부모클래스라서 그렇게 해도 된다.
		Rectangle r = new Rectangle();			// 다만 Shape 클래스에 setR 이런 녀석들이 정의가 안되어있어서 결국 에러가 난다.
		Triangle t = new Triangle();			// 추상 클래스는 이런식으로 뭔가 에러가 날 가능성이 높다.
		
		new call(c);
		new call(r);
		new call(t);
		
		/*call(c);								//Shape temp = c; 와 같다. 바로 위에서 정의된 c라는 녀석을 Shape 클래스의 temp방에 넣는것과 같아짐.(업캐스트)
		call(r);								//shape temp = r; 와 같다. 바로 위에서 정의된 r이라는 녀석을 Shape 클래스의 temp방에 넣는것과 같아짐.(업캐스트)
		call(t);*/								//상동
		
		/*c.setR(10);
		c.area();
		c.show();
		
		r.setW(5);
		r.setH(6);
		r.area();
		r.show();
		
		t.setW(5);
		t.setH(6);
		t.area();
		t.show();*/
		
		
	}

}
