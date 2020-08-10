package a20_6_30;

public class ch04ex04 {

	public static void main(String[] args) {
		int a=10,b=5, c=0;
		char op='+';							
		switch (op) {							//원래 switch 안에는 정수식이 들어가야하는데 어째서 char는 가능할까 아스키(유니)코드 때문에 각 문자 하나는 아스키코드의 정수로 컴퓨터가 인식하기 때문.
		case '+': c=a+b; break;					//마찬가지로 case내부에도 정수가 적혀야하지만 '+'의 + 문자가 정수로 들어가기 때문에 switch문이 가능함
		case '-': c=a-b; break;
		case '*': c=a*b; break;
		case '/': c=a/b; break;
		default: System.out.println("잘못된기호"); //default는 없어도 되기는 함
		
		}
		System.out.println(c);					//중괄호 밖에 sysout을 해야 결과물을 확인할 수 있음
	}

}
