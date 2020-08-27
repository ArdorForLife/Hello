package a20_8_26;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;


//순차접근을 위한 Iterator
//순차접근을 위한 Enumeration
//Vector나 ArrayList, LinkedList 에서 사용할것

public class collection4 {

	public static void main(String[] args) {
		Vector<String> name = new Vector(10,10);
		name.addElement("최명실");
		name.addElement("최수지");
		name.addElement("최진실");
		name.addElement("최순실");
		
		Iterator<String> item = name.iterator();		//item 집합
		while(item.hasNext()) {
			System.out.println(item.next());
		}
		
		System.out.println("===================");
		
		Enumeration item2 = name.elements();
		while(item2.hasMoreElements()) {
			System.out.println(item2.nextElement());
		}			
	}

}
