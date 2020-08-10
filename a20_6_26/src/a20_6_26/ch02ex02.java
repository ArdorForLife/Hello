package a20_6_26;
public class ch02ex02 {
	public static void main(String[] args) {
		int a=5,b=3;
		System.out.println(a/b);
		System.out.println(a&b);
		System.out.println(a/(double)b); 		//2개 중에 하나이상 (double)을 넣어주면 실수화가 되어서 제대로된 나눗셈 결과가 나온다
		System.out.println(a==b);				//a와 b가 같냐는 질문 그래서 false가 나옴
		System.out.println(a>=b);				//true
		System.out.println(a!=b);				//a와 b가 같지 않냐? true
		System.out.println(a>b && b==3);		// && 두개 붙이면 그리고~의 and임 둘 다 true라야 true라고 나옴
		System.out.println(a<b && b==3);		//둘중에 하나가 false이기 때문에 결과는 false
		System.out.println(a>b||b==3);			//엔터 위에꺼 || 파이프 라인이라고 함. 이것은 or임 둘중에 하나라도 true이면 true로 출력
		System.out.println(a<b||b==4);			//둘 다 false이면 false로 출력
		System.out.println(!(5>3));				// 5>3은 true이지만 !가 붙어서 false로 나옴
		
	}
}
