package a20_7_15;

public class Animal {
	private String name;
	private int age;
	public void show() {
		System.out.println("Animal name="+name);
		System.out.println("Animal age="+age);
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public Animal() {
		name="";
		age=0;
	}
	public Animal(String name,int age) {
		this.name=name;
		this.age=age;
	}
}
