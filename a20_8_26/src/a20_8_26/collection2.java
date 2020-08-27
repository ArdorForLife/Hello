package a20_8_26;

import java.util.Vector;

public class collection2 {

	public static void show(Vector<String> vec) {
		for(String name : vec) {
			System.out.println(name);
		}
	}
	
	public static void main(String[] args) {
		Vector<String> vec = new Vector<String>(2,2);
		// (100,10)이면 기본 100개 할당받고, 꽉차면 10씩 증가
		vec.add("홍길동");
			System.out.println(vec.size()+","+vec.capacity());
		vec.add("이순자");
			System.out.println(vec.size()+","+vec.capacity());
		vec.add("이기자");
			System.out.println(vec.size()+","+vec.capacity());
		
		vec.addElement("최고야");				//추천
		show(vec);
		
		vec.remove(0);
		vec.removeElement("이기자");			//추천
	}

}
