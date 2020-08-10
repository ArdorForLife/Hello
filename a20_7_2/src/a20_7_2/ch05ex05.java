package a20_7_2;
//구구단을 출력하시오
public class ch05ex05 {

	public static void main(String[] args) {
		int dan,n;
		for(dan=2;dan<=9;dan++) {
			for(n=1;n<=9;n++) {
				System.out.println(dan+"*"+n+"="+(dan*n));
			}
			System.out.println();							//각 단이 끝날때마다 한줄씩 띄워주는 것
		}
	}

}
