package a20_7_15;

public class mainTest {
	public static void main(String[] args) {
		고용 kim=new 고용();
		kim.setName("홍길동");
		kim.setSalary(3000);
		kim.show();
		
		매니저  lee=new 매니저();
		lee.setName("이민호");
		lee.setSalary(5000);
		lee.setDepartment("홍보부");
		lee.show();
		lee.show("연예인");
		
		개 latte=new 개();
		latte.setDog_name("Latte");
		latte.setDog_age(1);
		latte.show();
		
		개 monkey=new 개("몽키");
		monkey.setDog_age(7);
		monkey.show();
		
		개 okinawa=new 개("오키나와",3);
		okinawa.show();
	}
		

}
