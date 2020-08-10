package a20_7_15;

public class 고용 {
	private String name;
	private int salary;
	public void show() {
		System.out.println("name="+name+",salary="+salary);
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public 고용() {
		name="";		//여기서는 this.name 식으로 안해도 됨. 위의 setName에서는 name이 똑같기 때문에 this.를 해줌
		salary=0;
	}

}
