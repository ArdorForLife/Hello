package a20_7_7;
//배열에 저장된 데이터중 짝수만 골라서 b배열에 저장하시오
public class aTest3 {
	public static void main(String[] args) {
		int a[]= {10,90,86,77,90,23};
		int len=a.length;
		int i;
		int b[]=new int[len];
		int x=0;
		for(i=0;i<len;i++) {
			if(a[i]%2==0)
			{
				b[x]=a[i];
				x++;
			}
		}for(i=0;i<x;i++)
		System.out.println(b[i]);
		
		//선생님 방식. 입력 따로 출력 따로 하는게 좀 더 좋다고 하셨음

/*내방식		for(i=0;i<len;i++) {
			if(a[i]%2==0)
			{
				b[x]=a[i];			//x를 잡아주지 않고 b[i]=a[i]; 를 쓰게되면 홀수인 방도 넘어가서 0으로 처리된다. 그건 별로 좋지않다. 그래서 따로 x를 잡아서 표시해준다.
				System.out.println(b[x]);
				x++;
			}
		}
	*/
	}

}
