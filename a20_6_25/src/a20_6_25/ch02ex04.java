package a20_6_25;
public class ch02ex04 {
	public static void main(String[] args) {
		char a,b,c,d;				//char로 선언을 하면 각 문자들에 맞는 아스키코드 값으로 변환이 된다.
		a='A';					//모든 문자는 아스키코드(미국표준코드)이다. 아스키코드 A는 65
		b='a';					//아스키코드 a는 97
		c='1';					//아스키코드 1은 49
		d='가';
		System.out.println((int) '가'); //굳이 대문자로 글자를 보이고싶다면 중간에 쌍따옴표 2개를 넣는다
	}
}
