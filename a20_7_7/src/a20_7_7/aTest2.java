package a20_7_7;
//num배열의 모든 값을 출력하고
//num배열의 모든 값의 합(hap)을 출력하시오
//평균(avg)을 구하시오
public class aTest2 {
	public static void main(String[] args) {
		double num[]= {90.5, 88.5, 60, 75.0, 80.5};				//배열의 값이 너무 많으면 직접 하나하나 셀 수가 없어서 범위를 지정해주기 힘들다. 이럴 때는 이 명령어를 이용한다. num.length
		int i=0;
		double hap=0;
		int len=num.length;
		do{
			System.out.println((i+1)+"번째 값="+num[i]);
			hap=hap+num[i];
			i++;
		}while(i<num.length);
	System.out.println("합계="+hap);
	System.out.println("avg="+(hap/len));
	
	}

}