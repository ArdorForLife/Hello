package a20_7_23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class keyboardTest2 {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr=new InputStreamReader(System.in);				//scanner와 기능상 거의 같다고 보면 됨. 그러면 scanner를 쓰면 되는데 다른 이유(채팅프로그램 같은) 때문에
		BufferedReader in=new BufferedReader(isr);							//이 기능도 익혀놓아야함 그리고 scanner는 숫자,문자 다양하게 가능하나 이 기능은 문자열만 가능.
		System.out.println("글씨를 입력하면 따라합니다.");
		String str=in.readLine();
		System.out.println(str);
		
		
	}
		//isr에 키보드 a입력할 경우
		//a는 (byte) --> 문자로 변경 --> 버퍼가 생김(입력하는 것들이 지연된 채로 하나하나 다 입력이 됨)
}
