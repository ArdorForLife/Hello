package a20_6_29;								//
public class ch03ex01 {							//public 어디에서 누구든지 공개한다(접근지정자:public,protected,private)
	public static void main(String[] args) {	//method의 앞에 public도 method를 공개한다 이말임. static 정적메모리의 라는 말 끝날때까지 살아있다는 말. main method는 정적메모리(static)에 있어야 함. 지워지지않아야해서. ; heap 동적메모리
												//void 없음 이라는 자료형. 변수 앞에는 안 붙이고 main method 앞에 쓴다. void는 return 값이 없다라는 말. return값이 있다면 그 값의 유형에 따라 int,double 등으로 바꿔 적어야함
												//자바소스파일(hello.java) -->번역(영어로 컴파일compile) 그 번역기(컴파일러)가 누구냐면 javac.exe
												//그래서 만들어지는건 바이너리파일(hello.class) 
												//run을 누르면 화면에 뜨는건 실행기 ==>java.exe==
												//결과가 화면에 나온다. run을 안해도 저장하는 순간 javac.exe가 실행된다. 만약 error가 있으면 저장이 안된다.
		System.out.println("바보");
	}
}
