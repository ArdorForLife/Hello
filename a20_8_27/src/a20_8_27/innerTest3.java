package a20_8_27;

class triangle{
	int w;
	int h;
	double res;
	public void cal() {
		res=w*h/2.;
	}
	public void show() {
		System.out.println(res);
	}
	
}


public class innerTest3 {
	public static void main(String[] args) {
		triangle t = new triangle() {
			public void cal() {
				res=w*h/2.+0.5;
			}
			public void show() {
				System.out.println(res);
			}
		};
		t.cal();
		t.show();
		
	}

}
