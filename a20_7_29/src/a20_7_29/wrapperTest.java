package a20_7_29;
//기본자료(정수)--->랩퍼클래스--->문자열
public class wrapperTest
{
	public static void main(String[] args)
	{
		int myint=567;							//정수 -> 랩퍼클래스로 변경해보자
		
		Integer wi=new Integer(myint);			//첫번째 방법
		Integer wi2=Integer.valueOf(myint);		//두번째 방법		<-- 교수님이 이 방법을 추천하심
		
		String si=wi.toString();
		
		System.out.println(myint+10);			//숫자열+10
		System.out.println(si+10);				//문자열+10
		
		
		
		
	}

}
