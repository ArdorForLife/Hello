package a20_7_15;

public class 개 {
	private String dog_name;
	private int dog_age;
	public void show() {
		System.out.println("강아지 이름="+dog_name);
		System.out.println("강아지 나이="+dog_age);
	}
	public void setDog_name(String dog_name) {
		this.dog_name=dog_name;
	}
	public void setDog_age(int dog_age) {
		this.dog_age=dog_age;
	}
	//생성자 메소드 만들기
	public 개() {								//디폴트 생성자 메소드
		dog_name="";							//이 줄과 밑의 줄을 적지 않아도 빈공간과 0이 들어가지만 그래도 이제부터는 적어주도록 하자.
		dog_age=0;
	}
	public 개(String dog_name) {					//1개짜리 생성자 메소드		
		this.dog_name=dog_name;					//생성자 메소드도 오버로딩이 된다!!
	}
	public 개(String dog_name,int dog_age) {		//2개짜리 생성자 메소드
		this.dog_name=dog_name;
		this.dog_age=dog_age;
	}
}
