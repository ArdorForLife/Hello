package a20_7_15;

public class ��� {
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
	public ���() {
		name="";		//���⼭�� this.name ������ ���ص� ��. ���� setName������ name�� �Ȱ��� ������ this.�� ����
		salary=0;
	}

}
