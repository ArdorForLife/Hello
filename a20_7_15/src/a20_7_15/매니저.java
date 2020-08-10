package a20_7_15;

public class 매니저 {
	private String name;
	private int salary;
	private String department;
	public void show() {							//아무것도 전달 안되는 show
		System.out.println("매니저명="+name);
		System.out.println("연봉="+salary);
		System.out.println("부서명="+department);
		
	}
	public void show(String man) {					//하나가 전달되는 show			//이런식으로 show가 두개이상 존재할때는 오버로딩 이라고 한다.
		System.out.println(man+"명="+name);										//메소드 이름은 show로 똑같은데 메소드 안을 다르게 해주면 아주 다양하게 존재할 수 있다
		System.out.println(man+"연봉="+salary);
		System.out.println(man+"부서="+department);
	}
	
	public void setName(String name) {					//set뒤에 첫글자는 대문자로 꼭 넣어줌. setName 이렇게. 그리고 메소드 안에는 자료형과 다시 객체이름
		this.name=name;									//형식이 정해져 있으므로 형식을 외울것
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public void setDepartment(String department) {
		this.department=department;
	}
	public 매니저() {
		name="";
		salary=0;
		department="";
	}
	
}
