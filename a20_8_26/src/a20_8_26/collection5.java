package a20_8_26;
//map(맵) : key,value 한쌍으로 구성된 것	--> 순차구조 x
//맵 종류중에서 Hashtable 클래스 활용

import java.util.Hashtable;
import java.util.Set;

public class collection5 {

	public static void main(String[] args) {
		Hashtable<String,String> ht = new Hashtable<String,String>();
		ht.put("홍길동", "대구,010-939-997,18");
		ht.put("이순자", "대구,010-939-997,18");
		ht.put("이기자", "대구,010-939-997,18");
		ht.put("허준", "대구,010-939-997,18");
		
		Set<String> name = ht.keySet();
		for(String item : name) {
			System.out.println(item + ":" + ht.get(item));
		}
		
		System.out.println("==================");
		System.out.println(ht.get("허준"));
		
	}

}
