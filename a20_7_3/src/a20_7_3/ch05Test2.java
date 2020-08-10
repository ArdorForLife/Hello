package a20_7_3;
/*
 | 
*******
******
*****
****
***
**
**
|
*/
public class ch05Test2 {

	public static void main(String[] args) {
		int a,b,k;
		for(a=7;a>=1;a--) {
			if(a<=2) k=2;						//사고의 유연함이 필요하다
			else k=a;							//감소의 유형으로 생각하면 답이 잘 안나오고 그렇다면 다른 조건을 줄 수 있는지 찾아보자
			for(b=1;b<=k;b++) {
				System.out.print("*");
			}System.out.println();
		}
	}

}
