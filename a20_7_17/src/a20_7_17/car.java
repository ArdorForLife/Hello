package a20_7_17;

public class car {
	private String model;
	private String color;
	public void show() {
		System.out.println("모델명"+model);
		System.out.println("색상"+color);
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public car() {								//디폴트 메소드 생성자
	}
	public car(String model, String color) {	//2개짜리 메소드 생성자
		this.model = model;
		this.color = color;
	}
	
}
