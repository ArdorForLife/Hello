package a20_8_26;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;


//���������� ���� Iterator
//���������� ���� Enumeration
//Vector�� ArrayList, LinkedList ���� ����Ұ�

public class collection4 {

	public static void main(String[] args) {
		Vector<String> name = new Vector(10,10);
		name.addElement("�ָ���");
		name.addElement("�ּ���");
		name.addElement("������");
		name.addElement("�ּ���");
		
		Iterator<String> item = name.iterator();		//item ����
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