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
		// (100,10)�̸� �⺻ 100�� �Ҵ�ް�, ������ 10�� ����
		vec.add("ȫ�浿");
			System.out.println(vec.size()+","+vec.capacity());
		vec.add("�̼���");
			System.out.println(vec.size()+","+vec.capacity());
		vec.add("�̱���");
			System.out.println(vec.size()+","+vec.capacity());
		
		vec.addElement("�ְ��");				//��õ
		show(vec);
		
		vec.remove(0);
		vec.removeElement("�̱���");			//��õ
	}

}
