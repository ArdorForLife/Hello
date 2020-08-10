package a20_7_2;
//다중 for문
public class ch05ex04 {

	public static void main(String[] args) {
		int a,b,cnt=0;
		for(a=1;a<=3;a++) {							//a가 1일때 b가 2번, a가 2일때 b가 2번, a가 3일때 b가 2번 해서 총6번 돈다
			for(b=1;b<=2;b++) {
				System.out.println("몇번돌까요");
				cnt=cnt+1;
			}
		}
		System.out.println(cnt+"회");
	}

}
