package a20_7_9;
//100을 전달하여 1--100까지 합계를 출력하는 sum()메서드 만들기
//단, 결과 값을 리턴하시오
public class ch06ex03 {
	
	public static int sum(int a)
	{
		int hap=0;
		for(int i=1;i<=a;i++)
		{
			hap=hap+i;
		}
		return hap;
	}
	public static void main(String[] args) {
		int res=sum(100);
		System.out.println(res);
	}
}