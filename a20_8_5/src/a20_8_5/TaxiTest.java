package a20_8_5;

class Car {
		protected String model;
		protected String color;
		public Car() {}
		public Car(String model, String color) {
			this.model=model;
			this.color=color;
		}
		public void show() {
			System.out.println("�𵨸�="+model+",Į��="+color);
		}
}

class Taxi extends Car {
	private Boolean TaxiMeter;
	private int TaxiFare=3300;
	public Taxi() {
		super();
	}
	

	public Taxi(String model, String color, Boolean taxiMeter) {
		super(model, color);
		TaxiMeter = taxiMeter;
	}


	public Taxi(String model, String color) {
		super(model, color);
	}
	public Taxi(String model, String color, Boolean taxiMeter, int taxiFare) {
		super(model, color);
		TaxiMeter = taxiMeter;
		TaxiFare = taxiFare;
	}
	
	public void show() {
		super.show();
		System.out.println("�ýø�Ÿ��:"+TaxiMeter+"Į��:"+TaxiFare);
	}
}

public class TaxiTest {
	public static void main(String[] args) {
		Taxi t=new Taxi();
		t.show();
		Taxi t2=new Taxi(true, 3300);
		t2.show();
		
		Car c2=new Car("���", "���");
		c2.show();
		
		Car c4=new taxi("�ҳ�Ÿ","ȸ��",true,3300);
		c4.show();
	}
}
