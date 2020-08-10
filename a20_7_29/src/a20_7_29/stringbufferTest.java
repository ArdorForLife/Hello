package a20_7_29;

import java.util.Scanner;

import javax.swing.border.SoftBevelBorder;

public class stringbufferTest {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		Scanner sc=new Scanner(System.in);
		String name;
		for(int i=0;i<5;i++) {
			name=sc.next();					//next() 다음것을 읽어라
			sb.append(name);				//append() 명령어 추가하라
		}
		System.out.println(sb);
		sb.append('r');
		sb.append(10.5);
		sb.append("korea");
		sb.append(90);						//어떤 정수,문자,실수 등 다 추가된다
		System.out.println(sb);
		sb.insert(9,  ",bbb");				//9번째 문자 뒤에 ,bbb를 삽입하라
		System.out.println(sb);
		sb.reverse();						//문자열의 순서를 역으로 뒤집어라
		System.out.println(sb);
	}

}
