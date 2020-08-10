package a20_7_29;
//문자열80을 정수80으로 변경
public class wrapperTest2 
{
	public static void main(String[] args) 
	{
		String jumsu="80";						//문자열
		Integer ijum=Integer.valueOf(jumsu);	//정수형(아래에서 보겠지만 생략 가능함)
		int ia=ijum.intValue();					//이렇게 3단 구조를 거쳐야 함
		
		System.out.println(ia+2);				//변경된 정수형에서 +2
		System.out.println(jumsu+2);			//원래 문자열+2
		
		String kor="90";						//다른방법. 문자열 90을 정수변경
		int ikor=Integer.valueOf(kor);			//2단 구조로 바꿈. auto unboxing이라고 함
		
		
		
	}

}
