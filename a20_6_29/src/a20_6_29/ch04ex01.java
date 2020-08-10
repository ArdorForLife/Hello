package a20_6_29;
public class ch04ex01 {
	public static void main(String[] args) {
		int x=8;
		if(x%2==0)						//x가 짝수냐 라고 묻는 문장. 홀수냐라고 묻는 문장은 x%2==1 으로 물으면 된다. 혹은 x%2!=0 으로 물어도 홀수냐는 얘기임.
		System.out.println("짝수");		//5를 2로 나눈 나머지가 0 맞냐? true이면 첫문장인 "짝수" false면 두번째문장인 "홀수"
		else
		System.out.println("홀수");		//이대로 하면 0이 맞냐? 응! 그래서 짝수가 나오고 그밑에는 그냥 그대로 홀수 sysout도 되서 홀수도 나온다. 따라서 틀린 문장! 그래서 중간에 else를 넣어야 한다.
										//else가 있으면 if 다음 문장이 true의 것이고 else 다음 문장이 false의 것이 된다.
		System.out.println("끝");
		
		int k=11;
		if(k%2!=0)
		System.out.println("홀수");
		else
		System.out.println("짝수");
		
	}
}
