package a20_8_26;

import java.util.ArrayList;
import java.util.Collections;

public class collection1 {

	public static void show(ArrayList<Integer> a) {
		for(int num : a ) {
			System.out.println(num);
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(20);
		a.add(20);
		a.remove(0);					//0번째를 삭제
		a.remove(new Integer(20));		// 20이라는 정수를 삭제
		
		show(a);
		a.set(0, 100);
		a.set(1, 200);
		
		System.out.println("============");
		Collections.sort(a);
		show(a);
		
		
	}

}
