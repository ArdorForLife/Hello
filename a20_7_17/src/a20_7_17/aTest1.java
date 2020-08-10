package a20_7_17;

class taxi {
	private String color;
	private String model;
	private int meta;
	private int price;
	public void show() {
		System.out.println(color+","+model+","+meta+","+price);
	}
	public void setColor(String color) {
		this.color=color;
	}
	public void setModel(String model) {
		this.model=model;
	}
	public void setMeta(int meta) {
		this.meta=meta;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public void set(String color,String model,int meta,int price) {
		this.color=color;
		this.model=model;
		this.meta=meta;
		this.price=price;
	}
	public taxi() {}				//디폴트 생성자 메소드
	public taxi(int price) {		//1개짜리 생성자 메소드
		this.price=price;
	}
}

public class aTest1 {

	public static void main(String[] args) {
		taxi kim=new taxi();
		kim.set("Red","Sonata",2300,8800);
		kim.show();
		
		taxi lee=new taxi(3500);
		lee.setModel("Grandeur");
		lee.show();
		
	}

}
