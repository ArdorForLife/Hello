package a20_7_17;

public class mainTest {
	public static void main(String[] args) {
		car kim=new car();
		kim.setModel("BMW");
		kim.setColor("Black");
		kim.show();
		
		car lee=new car("Benz","Blue");
		lee.show();
		lee.setColor("White");
		lee.show();
	}
}
