package a20_7_30;

import java.util.Date;

//변수 앞 또는 메소드 앞 또는 클래스 앞에 붙일 수 있다.
//1)일반적으로는 변수나 메소드 앞에 붙여서 정적메모리에 저장시킨다.
//2)static 형태로 저장된 것들은 프로그램 끝날때까지 계속 살아있다.
//3)공유영역 같은 개념이다.
//4)클래스명을 통해서 바로 접근가능하다.(즉 new로 생성하지 않고)

class point3
{
	public static int x;
	public int y;
	public void cal() 
	{
		x=x+10;
		y=y+10;
		System.out.println("x="+x  +  ",y="+y);
	}
	public static void test() {
		System.out.println(x);
		//System.out.println(y); 	안된다.
	}
}

public class staticTest {
	public static void main(String[] args) {
		point3.x=5;									//x가 static이기 때문에 가능함. point3.y=3; 이런거는 안됨. static이 아니기 때문에.
		point3 park=new point3();
		park.cal();
		
		point3 kim=new point3();
		kim.cal();
		
		point3 lee=new point3();
		lee.cal();
		
		System.out.println(point3.x);	//클래스명을 통해 바로 접근 가능			
		point3.test();					//클래스명을 통해 바로 접근 가능
		
		Date now=new Date();
		System.out.println(now.toString());		//이게 정석임
		System.out.println(now);					//이렇게 해도 가능은 함
	}

}
