package kmv2;

public class test {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60,70,80,90};
		study1 kim=new study1();
		kim.BubbleSort(a);
		kim.arr_prn(a);
		
		kim.BubbleSort_R(a);
		kim.arr_prn(a);
		
		boolean t=kim.BinarySearch(a, 30);
		if(t==true) System.out.println("found OK");
		else System.out.println("key not found");
	}
	

}
