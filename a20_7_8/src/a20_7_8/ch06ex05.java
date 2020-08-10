package a20_7_8;
//2차 배열의 연구.
public class ch06ex05 {
	public static void main(String[] args) {
		int a[][]= {{90,88,77},{67,89,54},{99,30,100},{0,0,0}}; //c언어에서는 a[][3]이 알아서 3렬로 맞추나 java에서는 안됨 3개씩 들어가야가 빈 값이 있으면 0으로 처리함. 이 상태에서면 a[3][3]이 되는 것임 안에 숫자 빼야함 a[][]= //마지막 합계를 위해서 000을 추가함
		int i,j;
		int sum=0;
		//그냥 a.length라고 적으면 행의 갯수? 열의 갯수? 
		
		System.out.println("번호\t국어\t수학\t영어\t합계");
		for(i=0;i<a.length-1;i++)
		{
			sum=0;									//sum이 계속해서 더해지기 때문에 되돌아왔을 때 sum을 초기화시켜 줘야함.
			System.out.print((i+1)+"\t");
			for(j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+"\t");
				sum=sum+a[i][j];
				a[3][j]=a[3][j]+a[i][j]; 			//중요함. 연구할 것!
			}
			System.out.println(sum);
		}
		System.out.print("합계\t");
		for(i=0;i<3;i++) {
			System.out.print(a[3][i]+"\t");
		}
	}

}
