package a20_7_17;

public class car {
	private String model;
	private String color;
	public void show() {
		System.out.println("�𵨸�"+model);
		System.out.println("����"+color);
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
	public car() {								//����Ʈ �޼ҵ� ������
	}
	public car(String model, String color) {	//2��¥�� �޼ҵ� ������
		this.model = model;
		this.color = color;
	}
	
}
