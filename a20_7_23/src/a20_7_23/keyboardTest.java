package a20_7_23;

import java.io.IOException;

public class keyboardTest {

	public static void main(String[] args) throws IOException {
		char ch;
		ch=(char) System.in.read();				//특별히 java는 입출력에 관련되는 외부적인 접근에 있어서 에러가 생길 수 있다.
		System.out.println(ch);				//그것에 대비하여 에러처리 하도록 하고 있다. --> 예외처리(Exception) 라고 한다.
		
		
	}

}
