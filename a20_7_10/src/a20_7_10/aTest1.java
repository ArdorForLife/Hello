package a20_7_10;
//메서드 정의 -> void sum() {  }
//메서드 호출 -> sum();

//리턴값을 가진 메서드 정의 -> int sum() { return 0; }
//메서드 호출 -> int x=sum();

//두 수(a,b)를 메서드로 보내서 a부터 b까지의 합계(hap)를 출력하시오
public class aTest1 {
	
	public static int sum(int a, int b) {
		int i;
		int hap=0;
		for(i=a;i<=b;i++) {
			hap=hap+i;
		}
		return hap;
	}
	
	public static void main(String[] args) {
		int res=sum(10,50);
		System.out.println(res);
		
	}

}
