package a20_7_15;

public class �Ŵ��� {
	private String name;
	private int salary;
	private String department;
	public void show() {							//�ƹ��͵� ���� �ȵǴ� show
		System.out.println("�Ŵ�����="+name);
		System.out.println("����="+salary);
		System.out.println("�μ���="+department);
		
	}
	public void show(String man) {					//�ϳ��� ���޵Ǵ� show			//�̷������� show�� �ΰ��̻� �����Ҷ��� �����ε� �̶�� �Ѵ�.
		System.out.println(man+"��="+name);										//�޼ҵ� �̸��� show�� �Ȱ����� �޼ҵ� ���� �ٸ��� ���ָ� ���� �پ��ϰ� ������ �� �ִ�
		System.out.println(man+"����="+salary);
		System.out.println(man+"�μ�="+department);
	}
	
	public void setName(String name) {					//set�ڿ� ù���ڴ� �빮�ڷ� �� �־���. setName �̷���. �׸��� �޼ҵ� �ȿ��� �ڷ����� �ٽ� ��ü�̸�
		this.name=name;									//������ ������ �����Ƿ� ������ �ܿ��
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public void setDepartment(String department) {
		this.department=department;
	}
	public �Ŵ���() {
		name="";
		salary=0;
		department="";
	}
	
}
