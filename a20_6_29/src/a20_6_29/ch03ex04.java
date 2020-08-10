package a20_6_29;
public class ch03ex04 {
	public static void main(String[] args) {
		int a=10,b=30,c=90, max;
		System.out.println((a>b)?"예":"아니오");
		max=(a>b)?a:b;							//false이면 a:b 중에서 뒤에 b값이 max값이 된다. true이면 a값. max를 3항 연산자 라고 한다.
		System.out.println("최대값="+max);
		max=(max>c)?max:c;
		System.out.println("최대값="+max);
	}
}
